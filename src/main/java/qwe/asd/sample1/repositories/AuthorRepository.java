package qwe.asd.sample1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import qwe.asd.sample1.model.Author;

@Repository("authorrepository")
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
