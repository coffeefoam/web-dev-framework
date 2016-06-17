/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.database;

import java.lang.annotation.*;

/**
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)WebDataSoruce.java 1.0 17/06/2016
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebDataSoruce {
    String name() default WebDataSoruce.development;

    public static String development = "development";

    public static String production = "production";
}
