// CourseJdbcRepository.java
package com.mbarekDev.learn_jpa_and_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private static final String INSERT_QUERY = """
            INSERT INTO course (id, name, author)
            VALUES (2, 'Learn Generative AI', 'MbarekDev')
            """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
