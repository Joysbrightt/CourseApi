package com.Joysbrightt.CourseApi.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Topic {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    private String topic;
    @NonNull
    private String courseTitle;

    public Topic(String topic, String courseTitle, String topicCourseDescription) {
        this.topic = topic;
        this.courseTitle = courseTitle;
        this.topicCourseDescription = topicCourseDescription;
    }
    @NonNull

    private String topicCourseDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
