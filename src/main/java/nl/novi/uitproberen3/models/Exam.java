package nl.novi.uitproberen3.models;

import nl.novi.uitproberen3.models.WordList;

import javax.persistence.*;
import java.util.List;

@Entity
public class Exam {
//    private String words; //maar die krijgt ie niet van de client, die krijgt ie uit de database?
//    private enum titleWordList{WORD_LIST}; //client moet uit woordenlijst kiezen
//    private int timesPractised; //with list // activiteit bijhouden
//    private boolean spelledCorrectly;

    @Id
    @GeneratedValue
    private Long id;

    private String userInput;

    @OneToOne
    private WordList wordList;
    //OF
//    @OneToMany(mappedBy = "wordlists")
//    private List<WordList> wordLists;

    // User kiest van te voren met welke woordenlijst ze willen oefenen. Eenmaal in het 'Exam', is er maar 1 woordenlijst.

    public Exam() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserInput() {
        return userInput;
    }
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public WordList getWordList() {
        return wordList;
    }
    public void setWordList(WordList wordList) {
        this.wordList = wordList;
    }
}
