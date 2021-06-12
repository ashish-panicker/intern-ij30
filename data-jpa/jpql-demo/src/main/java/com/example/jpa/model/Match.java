package com.example.jpa.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matches")
public class Match {

    @Id
    private Long id;
    private String city;

    @Column(name = "match_date")
    private LocalDate matchDate;

    @Column(name="player_of_match")
    private String playerOfMatch;

    private String venue;

    @Column(name = "nuetral_venue")
    private boolean nuetralVenue;
    private String team1;
    private String team2;

    @Column(name = "toss_winner")
    private String tossWinner;

    @Column(name = "toss_decision")
    private String tossDecision;
    private String winner;
    private String result;

    @Column(name = "result_margin")
    private String resultMargin;
    private String eliminator;
    private String method;
    private String umpire1;
    private String umpire2;
    
}
