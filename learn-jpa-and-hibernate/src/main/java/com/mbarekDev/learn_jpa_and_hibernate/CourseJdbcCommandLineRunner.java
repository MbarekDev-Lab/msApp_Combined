// CourseJdbcCommandLineRunner.java
package com.mbarekDev.learn_jpa_and_hibernate;

import com.mbarekDev.learn_jpa_and_hibernate.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private final CourseJdbcRepository repository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(3, "Learn Prompt Engineering ", "MbarekDev"));
        repository.insert(new Course(4, "Learn  AWS ", "MbarekDev"));
        repository.insert(new Course(5, "Learn Prompt AI ", "MbarekDev"));
        repository.insert(new Course(6, "Learn Prompt Cloud ", "MbarekDev"));
        System.out.println("Course inserted successfully!");
    }
}
/*
CREATE TABLE course (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL
);
*/
