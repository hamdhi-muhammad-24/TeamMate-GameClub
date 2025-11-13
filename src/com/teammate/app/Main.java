package com.teammate.app;

import com.teammate.logic.PersonalityClassifier;
import com.teammate.model.Participant;
import com.teammate.model.PersonalityType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Create a few test participants
        Participant p1 = new Participant("P001", "Alice");
        p1.setPersonalityScore(95); // Should be LEADER
        p1.setInterests(Arrays.asList("Valorant", "FIFA"));

        Participant p2 = new Participant("P002", "Bob");
        p2.setPersonalityScore(75); // Should be BALANCED
        p2.setInterests(Arrays.asList("Dota"));

        Participant p3 = new Participant("P003", "Charlie");
        p3.setPersonalityScore(55); // Should be THINKER
        p3.setInterests(Arrays.asList("Basketball", "Badminton"));

        // Classify and set personality type using our classifier
        classifyAndPrint(p1);
        classifyAndPrint(p2);
        classifyAndPrint(p3);
    }

    private static void classifyAndPrint(Participant participant) {
        PersonalityType type = PersonalityClassifier.classify(participant.getPersonalityScore());
        participant.setPersonalityType(type);

        System.out.println("Participant: " + participant.getName());
        System.out.println("  Score: " + participant.getPersonalityScore());
        System.out.println("  Personality Type: " + participant.getPersonalityType());
        System.out.println("----------------------------------------");
    }
}
