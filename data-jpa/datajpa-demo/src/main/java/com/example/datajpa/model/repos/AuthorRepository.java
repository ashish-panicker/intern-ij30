package com.example.datajpa.model.repos;

import java.util.List;

import com.example.datajpa.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

    List<Author> findByName(String name);

    List<Author> findByNameOrderByName(String name);

    List<Author> findByNameOrderByNameDesc(String name);

    List<Author> findByGenre(String genre);

    List<Author> findByNameAndGenre(String name, String genre);

}
