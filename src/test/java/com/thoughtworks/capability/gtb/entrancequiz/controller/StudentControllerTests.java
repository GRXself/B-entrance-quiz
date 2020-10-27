package com.thoughtworks.capability.gtb.entrancequiz.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StudentControllerTests {

    @Autowired
    private StudentController studentController;

    @Test
    public void contextLoads() {
        assertThat(studentController).isNotNull();
    }
}
