package nl.novi.uitproberen3.models;

import nl.novi.uitproberen3.models.WordList;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue
    private Long id;

    private int wrongEntries;

    private boolean isPassed;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "wordlist_id")
    private WordList wordList;

    public Exam() {
    }

    public Exam(WordList wordList, int wrongEntries, boolean isPassed, LocalDateTime dateTime) {
        this.wordList = wordList;
        this.wrongEntries = wrongEntries;
        this.isPassed = isPassed;
        this.dateTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public WordList getWordList() {
        return wordList;
    }
    public void setWordList(WordList wordList) {
        this.wordList = wordList;
    }

    public int getWrongEntries() {
        return wrongEntries;
    }
    public void setWrongEntries(int wrongEntries) {
        this.wrongEntries = wrongEntries;
    }

    public boolean isPassed() {
        return isPassed;
    }
    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = LocalDateTime.now();
    }

//    public void setDateTime(LocalDateTime dateTime) {
//        this.dateTime = dateTime;
//    } // wanneer moet ik die local dat time zetten?

}

// User kiest van te voren met welke woordenlijst ze willen oefenen.
// Dus wanneer er een nieuw object Exam geinstansieerd wordt (door user)..
// Is er maar 1 woordenlijst. Dus?  ManyToOne
