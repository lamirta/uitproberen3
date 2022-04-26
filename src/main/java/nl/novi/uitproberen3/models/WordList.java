package nl.novi.uitproberen3.models;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "wordlists")
public class WordList {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @UniqueElements
    private String title;

    @ElementCollection
    private List<String> words = new ArrayList<String>();

    @OneToOne
    private Exam exam;
    //moet dit wel 1 to 1 zijn?

    public WordList() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getWords() {
        return words;
    }
    public void setWords(List<String> words) {
        this.words = words;
    }

}
