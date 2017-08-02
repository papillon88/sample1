package qwe.asd.sample1.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import qwe.asd.sample1.model.Author;
import qwe.asd.sample1.model.Book;
import qwe.asd.sample1.model.Publisher;
import qwe.asd.sample1.repositories.AuthorRepository;
import qwe.asd.sample1.repositories.BookRepository;
import qwe.asd.sample1.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublisherRepository publisherRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){

        //Eric
        Author eric = new Author("Eric","Evans");
        Publisher pub1 = new Publisher("harper collins","texas");
        Book ddd = new Book("Domain Driven Design","1234",pub1);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        pub1.getBooks().add(ddd);
        authorRepository.save(eric);
        publisherRepository.save(pub1);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Johnson");
        Publisher pub2 = new Publisher("Wrox","new york");
        Book noEJB = new Book("J2EE de sans EJB","2234",pub2);
        rod.getBooks().add(ddd);
        noEJB.getAuthors().add(eric);
        pub2.getBooks().add(noEJB);
        authorRepository.save(rod);
        publisherRepository.save(pub2);
        bookRepository.save(noEJB);
    }

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public PublisherRepository getPublisherRepository() {
        return publisherRepository;
    }

    public void setPublisherRepository(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
}
