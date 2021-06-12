package com.example.jpa.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.example.jpa.model.Match;
import com.example.jpa.util.HibnerateUtil;

import org.hibernate.Session;

public class MatchService {

    public List<Object[]> countMatchesByCity() {
        List<Object[]> matches = null;

        try (Session session = HibnerateUtil.getSessionFactory().openSession()) {
            String query = "select count(m.city), m.city from Match m group by m.city";
            matches = session.createQuery(query).list();
        }
        return matches;
    }

    public List<Match> findAllEliminators() {
        List<Match> matches = null;
        try (Session session = HibnerateUtil.getSessionFactory().openSession()) {

            String query = "select m from Match m " + "where m.eliminator = 'Y' ";
            matches = session.createQuery(query, Match.class).list();
        }
        return matches;
    }

    public List<Match> findMatchesByPlayerOfMatch(String player) {
        List<Match> matches = null;
        try (Session session = HibnerateUtil.getSessionFactory().openSession()) {

            String query = "select m from Match m " + "where m.playerOfMatch = :player ";
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Match> criteriaQuery = builder.createQuery(Match.class);
            Root<Match> root = criteriaQuery.from(Match.class);
            criteriaQuery.select(root).where(builder.equal(root.get("playerOfMatch"), player));
            matches = session.createQuery(query, Match.class).setParameter("player", player).list();
        }
        return matches;
    }

}
