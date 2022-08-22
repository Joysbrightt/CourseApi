package com.Joysbrightt.CourseApi.controller;

import com.Joysbrightt.CourseApi.CourseApiException;
import com.Joysbrightt.CourseApi.model.Topic;

import com.Joysbrightt.CourseApi.service.TopicService;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@Slf4j
public class CourseApiController {
    @Autowired
    private TopicService topicService;


@RequestMapping ("/topics")
    public List<Topic> getAllTopics(){
    return topicService.getAllTopics();
}

@GetMapping("/topics/{topic}")
public Topic getTopic(@PathVariable String topic){
    log.info("path variable topic --> {}", topic);
    try {
        return topicService.getTopic(topic);
    }catch (CourseApiException courseApiException){
        courseApiException.getMessage();
    }
return topicService.getTopic(topic);
}

@RequestMapping(method=RequestMethod.POST, value ="/topics")
public void addTopic(@RequestBody Topic topic){
    topicService.addTopic(topic);
}

    @RequestMapping(method=RequestMethod.PUT, value ="/topic")
    public void updateTopic(@RequestBody Topic topic1, @PathVariable String topic){
        topicService.updateTopic(topic1,topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value ="/topic")
    public void deleteTopic( @PathVariable String topic){
        topicService.deleteTopic(topic);
    }
}