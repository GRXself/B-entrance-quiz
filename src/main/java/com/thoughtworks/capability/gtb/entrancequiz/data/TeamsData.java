package com.thoughtworks.capability.gtb.entrancequiz.data;

import com.thoughtworks.capability.gtb.entrancequiz.model.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamsData {

    private static TeamsData instance = new TeamsData();

    private List<Team> allTeams = new ArrayList<>();

    private TeamsData() {
        initData();
    }

    public static TeamsData getInstance() {
        return instance;
    }

    public List<Team> getAllTeams() {
        return allTeams;
    }

    public void resetTeams() {
        allTeams.forEach(team -> {
            team.clearMembers();
        });
    }

    private void initData() {
        allTeams.add(new Team("1组"));
        allTeams.add(new Team("2组"));
        allTeams.add(new Team("3组"));
        allTeams.add(new Team("4组"));
        allTeams.add(new Team("5组"));
        allTeams.add(new Team("6组"));
    }
}
