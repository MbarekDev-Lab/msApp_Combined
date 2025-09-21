package com.mbarekDev.learn_jpa_and_hibernate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

@DataJpaTest
@Sql(scripts = {"/schema.sql"})
public class CourseRepositoryTest {
    
    @Test
    public void testCourseTable() {

    }
}