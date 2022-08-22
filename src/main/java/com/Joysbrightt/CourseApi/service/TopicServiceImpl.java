package com.Joysbrightt.CourseApi.service;

import com.Joysbrightt.CourseApi.CourseApiException;
import com.Joysbrightt.CourseApi.model.Topic;
import com.Joysbrightt.CourseApi.repository.TopicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class TopicServiceImpl implements TopicService{
    @Autowired
    private TopicRepository topicRepository;

    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    };

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);{
            return topics;
        }

    }

    @Override
    public Topic getTopic(String topic) {
        log.info("get topic --> {}", topic);
        Topic topics = new Topic();
        if (topic.equals(topics.getTopic())) {
            topics.getTopic().charAt(0);
//        if (topics.contains(topic)) {
//            return
//                topics.stream()
//                .filter(t -> t.getTopic().equals(topic))
//                .findFirst().get();}
            if (!topic.equals(topics.getTopic())) {
                throw new CourseApiException("topic not found");
            }

        }
        return topicRepository.findOne(topic);
    }

    @Override
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public void updateTopic(Topic topic1, String topic) {
//        for (int i = 0; i < topics.size() ; i++) {
//Topic t = topics.get(i);
//if (t.getTopic().equals(topic))
//    topics.set(i, topic1);
//return;
//        }
         topicRepository.save(topic1);
    }

    @Override
    public void deleteTopic(String topic) {

    }

    @Override
    public Topic getTopics(String topic) {
        return topicRepository.findOne(topic);
    }


    @Override
    public void deleteTopic(Topic topic) {
        topicRepository.delete(topic);

    }


}
