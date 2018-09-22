package springboot.project.project.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long aid;
    private String Firstname;
    private String LastName;

    @ManyToMany
    private Set<Books> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstname, String lastName) {
        Firstname = firstname;
        LastName = lastName;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
