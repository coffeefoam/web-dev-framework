/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * 时间监听
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)ProcessListner.java 1.0 17/06/2016
 */
@Component
public interface ProcessListener {
    /**
     * 处理监听中的事宜
     *
     * @param event
     * @return
     */
    public boolean process(ApplicationEvent event);
}
