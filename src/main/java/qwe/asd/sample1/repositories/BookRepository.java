package qwe.asd.sample1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import qwe.asd.sample1.models.Book;

@Repository("bookrepo")
public interface BookRepository extends CrudRepository<Book,Long> {
}
