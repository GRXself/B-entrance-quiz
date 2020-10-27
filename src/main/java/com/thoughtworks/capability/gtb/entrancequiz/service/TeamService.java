package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.data.StudentsData;
import com.thoughtworks.capability.gtb.entrancequiz.data.TeamsData;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.model.Team;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TeamService {

    private List<Team> allTeams = TeamsData.getInstance().getAllTeams();

    private List<Student> allStudents = StudentsData.getInstance().getAllStudents();

    public List<Team> getTeamsWithRandomMember() {
        TeamsData.getInstance().resetTeams();
        List<Student> shuffledStudents = getShuffledStudents();
        putStudentsIntoTeams(shuffledStudents);
        return allTeams;
    };

    private List<Student> getShuffledStudents() {
        List<Student> shuffledStudents = allStudents;
        Collections.shuffle(shuffledStudents);
        return shuffledStudents;
    }

    private void putStudentsIntoTeams(List<Student> students) {
        int numberPerTeam = students.size() / allTeams.size();

        for( int studentIndex = 0, teamOffset = 0; studentIndex < students.size(); studentIndex++) {
            int teamIndex = studentIndex / numberPerTeam;
            if (teamIndex >= allTeams.size()) {
                teamIndex = teamOffset;
                teamOffset++;
            }
            allTeams.get(teamIndex).addMembers(students.get(studentIndex));
        }
    }
}
