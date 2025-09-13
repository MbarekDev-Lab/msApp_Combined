package com.mbarekDev.devApp_ms.controllers;

import com.mbarekDev.devApp_ms.entities.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CoursController {
    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "MbarekDev"),
                new Course(1, "Learn DevOps", "MbarekDev"),
                new Course(1, "Learn MS", "MbarekDev")
        );
    }


}
