/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web;

import java.util.Properties;

/**
 * web应用的配置项,读取class目录下的properties文件进行配置项的加载
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)WebConfig.java 1.0 17/06/2016
 */
public interface WebConfig {
    /**
     * 加载properties的配置文件
     *
     * @param filename
     * @return
     */
    public Properties loadProperties(String filename);

    /**
     * 获得系统状态
     *
     * @param propKey
     * @return
     */
    public String getSystemStatus();

    /**
     * 是否为开发环境
     *
     * @return
     */
    public boolean isDevelopment();
}
