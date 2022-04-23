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

//    private List<Word> wordlist;


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

}


//    WordList list1 = new WordList();
//
//    list1.add("elephant");

//            words.add("elephant");
//        words.add("giraffe");
//        words.add("elephant");
//        words.add("horse");
//