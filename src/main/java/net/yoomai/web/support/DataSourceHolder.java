/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.support;

/**
 * 数据源名称的设置,用于查找,线程安全
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)CustomerContextHolder.java 1.0 17/06/2016
 */
public class DataSourceHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDataSource(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getDataSource() {
        return contextHolder.get();
    }

    public static void clearDataSource() {
        contextHolder.remove();
    }
}
