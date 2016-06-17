/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.database;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * 基础操作,hibernate数据操作
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)GenericDAO.java 1.0 17/06/2016
 */
public class GenericDAO<T, PK extends Serializable> {
    private Class<T> persistClass;

    @Autowired
    protected HibernateTemplate hibernateTemplate;

    public void setPersistClass(Class<T> persistClass) {
        this.persistClass = persistClass;
    }

    /**
     * 根据主键获取相关实体
     *
     * @param id
     * @return
     */
    public T get(PK id) {
        return hibernateTemplate.get(this.persistClass, id);
    }

    /**
     * 保存实体
     *
     * @param entity
     * @return
     */
    public PK save(T entity) {
        Serializable id = hibernateTemplate.save(entity);
        if (id == null) {
            return null;
        }

        return (PK) id;
    }



    /**
     * 更新实体信息
     *
     * @param entity
     */
    public void update(T entity) {
        hibernateTemplate.update(entity);
    }

    /**
     * 删除单一实体
     *
     * @param entity
     */
    public void delete(T entity) {
        hibernateTemplate.delete(entity);
    }

    /**
     * 删除多个实体
     *
     * @param entities
     */
    public void deleteAll(Collection<T> entities) {
        hibernateTemplate.deleteAll(entities);
    }

    /**
     * 分页获取数据信息
     *
     * @param start
     * @param max
     * @return
     */
    public List<T> page(final int start, final int max, final String propertyName, final boolean desc) {
        return hibernateTemplate.execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
                String hql = "from " + persistClass.getName() + " order by " + propertyName;
                if (desc) {
                    hql += " desc";
                }

                Query query = session.createQuery(hql).setFirstResult(start).setMaxResults(max);
                return query.list();
            }
        });
    }

    /**
     * 获得记录总数
     *
     * @return
     */
    public long count() {
        return hibernateTemplate.execute(new HibernateCallback<Long>() {
            @Override
            public Long doInHibernate(Session session) throws HibernateException, SQLException {
                String hql = "select count(*) from " + persistClass.getName();
                Query query = session.createQuery(hql);
                return (Long) query.uniqueResult();
            }
        });
    }
}
