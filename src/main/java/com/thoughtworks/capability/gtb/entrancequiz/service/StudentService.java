package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.data.StudentsData;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentsData studentsData = StudentsData.getInstance();

    public List<Student> getAllStudents() {
        return studentsData.getAllStudents();
    }
}
