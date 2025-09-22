// CourseJdbcRepository.java
package com.mbarekDev.learn_jpa_and_hibernate.course;

import com.mbarekDev.learn_jpa_and_hibernate.course.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static final String INSERT_QUERY = """
            INSERT INTO course (id, name, author)
            VALUES (?,?,?)
            """;

    private static final String DELETE_QUERY = """
            DELETE FROM  course WHERE ID = ?
            """;

    private static final String SELECT_QUERY = """
            DELETE FROM  course WHERE ID = ?
            """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(int id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(int id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
