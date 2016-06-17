/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.listeners;

import java.util.List;

/**
 * 监听链条
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)ListenerChain.java 1.0 17/06/2016
 */
public class ListenerChain {
    private List<ProcessListener> listeners;

    public ListenerChain(List<ProcessListener> listeners) {
        this.listeners = listeners;
    }

    /**
     * 处理事件,将事件传递给所有的监听器,直到返回成功为止
     *
     * @param event
     */
    public void fireEvents(WebEvent event) {
        for (ProcessListener listener : listeners) {
            if (listener.process(event)) {
                break;
            }
        }
    }
}
