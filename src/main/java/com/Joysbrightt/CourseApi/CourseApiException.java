package com.Joysbrightt.CourseApi;

public class CourseApiException extends  RuntimeException{
    private String message;

    public CourseApiException(String message) {
        this.message = message;
    }
}
