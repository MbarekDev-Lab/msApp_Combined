package com.mbarekDev.learn_jpa_and_hibernate.course.springdatajpa;

import com.mbarekDev.learn_jpa_and_hibernate.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
}
