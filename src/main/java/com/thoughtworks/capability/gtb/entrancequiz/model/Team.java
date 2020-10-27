package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Student> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getMembers() {
        return members;
    }

    public void addMembers(Student student) {
        members.add(student);
    }
}
