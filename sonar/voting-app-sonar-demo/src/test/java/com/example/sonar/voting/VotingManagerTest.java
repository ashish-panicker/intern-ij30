package com.example.sonar.voting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VotingManagerTest {
    @Test
    public void testCanTheVoterVoteLegalAge() {
        Voter voter = new Voter("Rahul", 22);
        assertTrue("Voter is of legal age.", VotingManager.canTheVoterVote(voter));
    }

    @Test
    public void testCanTheVoterVoteMinorAge() {
        Voter voter = new Voter();
        voter.setName("Ajay");
        voter.setAge(17);
        assertFalse("Voter is a minor.", VotingManager.canTheVoterVote(voter));
    }
}
