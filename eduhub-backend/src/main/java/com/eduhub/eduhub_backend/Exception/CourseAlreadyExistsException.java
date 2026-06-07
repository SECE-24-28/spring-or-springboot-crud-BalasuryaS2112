package com.eduhub.eduhub_backend.Exception;

public class CourseAlreadyExistsException extends RuntimeException{
    public CourseAlreadyExistsException(String message) {
        super(message);
    }
}
