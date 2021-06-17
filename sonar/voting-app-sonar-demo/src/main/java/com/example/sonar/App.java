package com.example.sonar;

import com.example.sonar.voting.Voter;
import com.example.sonar.voting.VotingManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Voter voter1 = new Voter("Rahul", 22);
        Voter voter2 = new Voter("Ajay", 17);

        VotingManager.canTheVoterVote(voter1);
        VotingManager.canTheVoterVote(voter2);
    }
}
