package com.teammate.model;

import java.util.List;

public class Participant {

    private String id;
    private String name;
    private String gameOrSport;      // e.g., "Valorant", "Dota", "FIFA", "Basketball"
    private int skillLevel;          // you can refine type later based on CSV
    private String preferredRole;    // will match roles from starter pack
    private int personalityScore;    // total score from 5 questions
    private PersonalityType personalityType;
    private List<String> interests;  // in case they select multiple interests

    public Participant(String id, String name) {
        this.id = id;
        this.name = name;
        this.personalityType = PersonalityType.UNKNOWN;
    }

    // --- Getters and Setters ---

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameOrSport() {
        return gameOrSport;
    }

    public void setGameOrSport(String gameOrSport) {
        this.gameOrSport = gameOrSport;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getPreferredRole() {
        return preferredRole;
    }

    public void setPreferredRole(String preferredRole) {
        this.preferredRole = preferredRole;
    }

    public int getPersonalityScore() {
        return personalityScore;
    }

    public void setPersonalityScore(int personalityScore) {
        this.personalityScore = personalityScore;
    }

    public PersonalityType getPersonalityType() {
        return personalityType;
    }

    public void setPersonalityType(PersonalityType personalityType) {
        this.personalityType = personalityType;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gameOrSport='" + gameOrSport + '\'' +
                ", skillLevel=" + skillLevel +
                ", preferredRole='" + preferredRole + '\'' +
                ", personalityScore=" + personalityScore +
                ", personalityType=" + personalityType +
                ", interests=" + interests +
                '}';
    }
}
