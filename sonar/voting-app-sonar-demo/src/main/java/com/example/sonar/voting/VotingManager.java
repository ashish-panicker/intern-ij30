package com.example.sonar.voting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VotingManager {

    private VotingManager(){}

    private static final Logger LOGGER = Logger.getLogger(VotingManager.class.getName());

    static {
        LOGGER.setLevel(Level.INFO);
    }

    public static boolean canTheVoterVote(Voter voter) {
        if (voter.getAge() >= 18) {
            LOGGER.info("The voter " + voter.getName() + " can vote.");
            return true;
        } else {
            LOGGER.info("The voter " + voter.getName() + " cannot vote.");
            return false;
        }
    }

}
