package springboot.project.project.Repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.project.project.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
