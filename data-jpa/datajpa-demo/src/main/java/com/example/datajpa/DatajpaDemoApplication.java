package com.example.datajpa;

import java.util.ArrayList;
import java.util.List;

import com.example.datajpa.model.Author;
import com.example.datajpa.model.repos.AuthorRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DatajpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatajpaDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner createDummyAuthors(AuthorRepository authorRepository) {
		return (args) -> {
			log.info("inside the createDummyAuthors() CommandLineRunner...");

			log.debug("Creating new authors...");

			Author author1 = new Author("Enid Blyton", "Fiction");
			Author author2 = new Author("Eric nylund", "Science Fiction");
			Author author3 = new Author("Larry pressler", "Contemperory");
			Author author4 = new Author("Margaret Atwood", "Victorian Fiction");
			Author author5 = new Author("Emily Bronte", "Victorian Fiction");

			Author retValue = null;

			List<Integer> authorIdList = new ArrayList<>();

			retValue = authorRepository.save(author1);
			authorIdList.add(retValue.getId());
			log.info("created author " + retValue.toString());

			retValue = authorRepository.save(author2);
			authorIdList.add(retValue.getId());
			log.info("created author " + retValue.toString());

			retValue = authorRepository.save(author3);
			authorIdList.add(retValue.getId());
			log.info("created author " + retValue.toString());

			retValue = authorRepository.save(author4);
			authorIdList.add(retValue.getId());
			log.info("created author " + retValue.toString());
			
			retValue = authorRepository.save(author5);
			authorIdList.add(retValue.getId());
			log.info("created author " + retValue.toString());

			log.info("finding all by genre");
			authorRepository.findByGenre("Victorian Fiction")
							.stream().forEach(a -> log.info(a.toString()));

			// log.info("fetcching all authors...");
			// authorRepository.findAll().stream().forEach(a -> log.info("Author: " + a));

			// log.info("deleting all authors...");
			// authorIdList.stream().forEach(id -> authorRepository.delete(authorRepository.findById(id).orElseThrow()));

		};
	}

}
