package com.Joysbrightt.CourseApi.service;

import com.Joysbrightt.CourseApi.model.Topic;

import java.util.List;

public interface TopicService {
    public List<Topic> getAllTopics();

    public Topic getTopic(String topic);

   public void addTopic(Topic topic);

   public void updateTopic(Topic topic1, String topic);

   public void deleteTopic(String topic);

    public Topic getTopics(String topic);

   public void deleteTopic(Topic topic);
}
