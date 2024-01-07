package dev.java.springboot.spring5webApp.respositories;

import dev.java.springboot.spring5webApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
