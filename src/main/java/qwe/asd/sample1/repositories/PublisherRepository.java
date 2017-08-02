package qwe.asd.sample1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import qwe.asd.sample1.model.Publisher;

@Repository("publisherrepo")
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
