package com.teammate.model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamId;
    private List<Participant> members;

    public Team(String teamId) {
        this.teamId = teamId;
        this.members = new ArrayList<>();
    }

    public String getTeamId() {
        return teamId;
    }

    public List<Participant> getMembers() {
        return members;
    }

    public void addMember(Participant participant) {
        if (participant != null) {
            members.add(participant);
        }
    }

    public int getSize() {
        return members.size();
    }

    public long countByPersonality(PersonalityType type) {
        return members.stream()
                .filter(p -> p.getPersonalityType() == type)
                .count();
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId='" + teamId + '\'' +
                ", members=" + members +
                '}';
    }
}