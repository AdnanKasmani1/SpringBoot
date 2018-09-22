package springboot.project.project.model;


import javax.persistence.*;
import java.security.PrivateKey;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Books  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long bid;
    private  String name;
    private  int isbn;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "bid"),
            inverseJoinColumns = @JoinColumn(name = "aid"))
    private Set<Author> author = new HashSet<>();

    public Books() {
    }

    public Books(String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }
}
