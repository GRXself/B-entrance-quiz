package com.thoughtworks.capability.gtb.entrancequiz.data;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsData {

    private static StudentsData instance = new StudentsData();

    private List<Student> allStudents = new ArrayList<>();

    private StudentsData() {
        initData();
    }

    public static StudentsData getInstance() {
        return instance;
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public void addStudent(Student student) {
        allStudents.add(student);
    }

    private void initData() {
        allStudents.add(new Student(1, "成吉思汗"));
        allStudents.add(new Student(2, "鲁班七号"));
        allStudents.add(new Student(3, "太乙真人"));
        allStudents.add(new Student(4, "钟无艳"));
        allStudents.add(new Student(5, "花木兰"));
        allStudents.add(new Student(6, "雅典娜"));
        allStudents.add(new Student(7, "芈月"));
        allStudents.add(new Student(8, "白起"));
        allStudents.add(new Student(9, "刘禅"));
        allStudents.add(new Student(10, "庄周"));
        allStudents.add(new Student(11, "马超"));
        allStudents.add(new Student(12, "刘备"));
        allStudents.add(new Student(13, "哪吒"));
        allStudents.add(new Student(14, "大乔"));
        allStudents.add(new Student(15, "蔡文姬"));
    }
}
