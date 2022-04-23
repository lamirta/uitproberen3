package nl.novi.uitproberen3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wordlists")
public class WordList {

    @Id
    @Column(nullable = false, unique = true)
    private String title;

//    @Column
//    private List<Word> wordlist = new WordList;


    public WordList() {

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