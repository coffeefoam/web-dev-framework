/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.test;

import net.yoomai.web.services.TopicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)TestDatabaseExchange.java 1.0 17/06/2016
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/core.xml")
public class TestDatabaseExchange {
    @Autowired
    private TopicService topicService;

    @Test
    public void testGetTopic() {
        topicService.getTopic(1);
    }
}
