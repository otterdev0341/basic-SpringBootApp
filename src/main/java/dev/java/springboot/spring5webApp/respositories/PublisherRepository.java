package dev.java.springboot.spring5webApp.respositories;

import dev.java.springboot.spring5webApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
