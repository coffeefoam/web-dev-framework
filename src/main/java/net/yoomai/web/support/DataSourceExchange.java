/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.support;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)DataSourceExchange.java 1.0 17/06/2016
 */
public class DataSourceExchange implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        WebDataSoruce webDataSoruce = methodInvocation.getMethod().getAnnotation(WebDataSoruce.class);
        DataSourceHolder.setDataSource(webDataSoruce.name());

        try {
            methodInvocation.proceed();
        } catch (Exception e) {

        }

        return null;
    }
}
