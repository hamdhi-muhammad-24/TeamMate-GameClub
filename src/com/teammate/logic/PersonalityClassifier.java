package com.teammate.logic;

import com.teammate.model.PersonalityType;

public class PersonalityClassifier {

    /**
     * Classifies the personality type based on total score.
     *
     * @param score total score from 5 personality questions
     * @return PersonalityType (LEADER, BALANCED, THINKER, or UNKNOWN)
     */
    public static PersonalityType classify(int score) {
        // Basic validation (we'll improve exception handling later)
        if (score < 0 || score > 100) {
            // For now, just mark as UNKNOWN; later we can throw a custom exception
            return PersonalityType.UNKNOWN;
        }

        if (score >= 90 && score <= 100) {
            return PersonalityType.LEADER;
        } else if (score >= 70 && score <= 89) {
            return PersonalityType.BALANCED;
        } else if (score >= 50 && score <= 69) {
            return PersonalityType.THINKER;
        } else {
            // Score is valid but below 50 – not classified in your spec
            return PersonalityType.UNKNOWN;
        }
    }
}
