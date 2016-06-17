/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.support;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)MultipleDataSource.java 1.0 17/06/2016
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }
}
