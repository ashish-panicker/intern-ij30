package com.example.jpa;

import com.example.jpa.service.MatchService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MatchService matchService =
                new MatchService();
        // matchService.countMatchesByCity()
        // matchService.findAllEliminators()
        matchService.findMatchesByPlayerOfMatch("MS Dhoni")
                .stream()
                .forEach(System.out::println);
    }
}
