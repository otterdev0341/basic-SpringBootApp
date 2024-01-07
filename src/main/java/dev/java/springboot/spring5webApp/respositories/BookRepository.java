package dev.java.springboot.spring5webApp.respositories;

import dev.java.springboot.spring5webApp.domain.Book;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;


public interface BookRepository extends CrudRepository<Book, Long> {

}
