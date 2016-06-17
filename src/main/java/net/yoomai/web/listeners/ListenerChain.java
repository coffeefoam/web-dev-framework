/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 监听链条
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)ListenerChain.java 1.0 17/06/2016
 */
@Component
public class ListenerChain implements ApplicationListener {
    @Autowired
    private List<ProcessListener> listeners;

    /**
     *  处理事件,将事件传递给所有的监听器,直到返回成功为止
     *
     * @param applicationEvent
     */
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        for (ProcessListener listener : listeners) {
            if (listener.process(applicationEvent)) {
                break;
            }
        }
    }
}
