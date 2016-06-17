/**
 * Copyright (c) 2015-2016, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.web.services;

import net.yoomai.web.database.TopicDAO;
import net.yoomai.web.po.Topic;
import net.yoomai.web.support.WebDataSoruce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)TopicService.java 1.0 17/06/2016
 */
@Service
public class TopicService {
    @Autowired
    private TopicDAO topicDAO;

    @WebDataSoruce(name = "development")
    public Topic getTopic(int id) {
        return topicDAO.get(id);
    }
}
