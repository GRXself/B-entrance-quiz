package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Team;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping("/teams")
    public ResponseEntity<List<Team>> getTeamsWithRandomMember() {
        return new ResponseEntity<List<Team>>(teamService.getTeamsWithRandomMember(), HttpStatus.OK);
    }
}
