package nl.novi.uitproberen3.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String word;

    private boolean spelledCorrectly;

    public Word() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public boolean isSpelledCorrectly() {
        return spelledCorrectly;
    }
    public void setSpelledCorrectly(boolean spelledCorrectly) {
        this.spelledCorrectly = spelledCorrectly;
    }
}
