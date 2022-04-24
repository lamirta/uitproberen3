package nl.novi.uitproberen3.models;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wordlists")
public class WordList {
// NIEUW IDEE!!!
// Of ik maak gewoon 20 velden aan, met word1 t/m word20

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

// 20 velden met word:
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @NotBlank
//    @UniqueElements
//    private String title;

//    private String word01;
//    private String word02;
//    private String word03;
//    private String word04;
//    private String word05;
//    private String word06;
//    private String word07;
//    private String word08;
//    private String word09;
//    private String word10;
//    private String word11;
//    private String word12;
//    private String word13;
//    private String word14;
//    private String word15;
//    private String word16;
//    private String word17;
//    private String word18;
//    private String word19;
//    private String word20;


