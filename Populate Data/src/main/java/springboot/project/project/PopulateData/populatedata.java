package springboot.project.project.PopulateData;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import springboot.project.project.Repositories.AuthorRepository;
import springboot.project.project.Repositories.BookRepository;
import springboot.project.project.model.Author;
import springboot.project.project.model.Books;

@Component
public class populatedata implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public populatedata(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
         gendata();
    }

    public void gendata()
    {
        Author adnan = new Author("adnan","Ahmed");
        Books book2 = new Books("adnan",1234);


        adnan.getBooks().add(book2);
        book2.getAuthor().add(adnan);

       authorRepository.save(adnan);
        // bookRepository.save(book1);
        bookRepository.save(book2);












    }
}
