// CourseJdbcCommandLineRunner.java
package com.mbarekDev.learn_jpa_and_hibernate.course;

import com.mbarekDev.learn_jpa_and_hibernate.course.entities.Course;
import com.mbarekDev.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // @Autowired
    //private final CourseJdbcRepository repository;
    //    @Autowired
    //    private CourseJpaRepository courseJpaRepository;
    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;


//    public CourseCommandLineRunner(CourseJdbcRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(3, "Learn Prompt Engineering JPA", "MbarekDev"));
//        repository.insert(new Course(4, "Learn  AWS JPA ", "MbarekDev"));
//        repository.insert(new Course(5, "Learn Prompt AI JPA", "MbarekDev"));
//        repository.insert(new Course(6, "Learn Prompt Cloud JPA", "MbarekDev"));
//        repository.deleteById(4);
//        repository.findById(2);

//        courseJpaRepository.insert(new Course(3, "Learn Prompt Engineering JPA", "MbarekDev"));
//        courseJpaRepository.insert(new Course(4, "Learn  AWS JPA ", "MbarekDev"));
//        courseJpaRepository.insert(new Course(5, "Learn Prompt AI JPA", "MbarekDev"));
//        courseJpaRepository.insert(new Course(6, "Learn Prompt Cloud JPA", "MbarekDev"));
//        courseJpaRepository.deleteById(4);
//        Course course = courseJpaRepository.findById(2);
//        System.out.println(course);//


        courseSpringDataJpaRepository.save(new Course(3, "Learn Prompt Engineering JPA", "MbarekDev"));
        courseSpringDataJpaRepository.save(new Course(4, "Learn  AWS JPA ", "MbarekDev"));
        courseSpringDataJpaRepository.save(new Course(5, "Learn Prompt AI JPA", "MbarekDev"));
        courseSpringDataJpaRepository.save(new Course(6, "Learn Prompt Cloud JPA", "MbarekDev"));
        courseSpringDataJpaRepository.deleteById(4L);
        Optional<Course> course = courseSpringDataJpaRepository.findById(2L);
        course.ifPresentOrElse(
                c -> System.out.println("Found: " + c),
                () -> System.out.println("Course with ID 2 not found")
        );
        //System.out.println(course);

        System.out.println("Course operations successfully completed!");
    }
}
/*
CREATE TABLE course (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL
);
*/
