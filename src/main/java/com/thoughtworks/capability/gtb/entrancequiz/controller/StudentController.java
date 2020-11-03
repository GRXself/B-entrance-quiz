package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    // TODO GTB-工程实践: - @Autowired注解可以省略
    @Autowired
    private StudentService studentService;

    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping("/students")
    // TODO GTB-知识点: - 已经使用@RestController，可以直接返回List
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
