package com.Joysbrightt.CourseApi.repository;

import com.Joysbrightt.CourseApi.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {

   Topic findOne(String topic);
}
