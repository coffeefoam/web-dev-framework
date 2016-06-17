/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.database;

import net.yoomai.web.po.Topic;
import org.springframework.stereotype.Repository;

/**
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)TopicDAO.java 1.0 17/06/2016
 */
@Repository
public class TopicDAO extends GenericDAO<Topic, Integer> {
    public TopicDAO() {
        setPersistClass(Topic.class);
    }
}
