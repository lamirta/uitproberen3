package nl.novi.uitproberen3.models;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "wordlists")
public class WordList {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @UniqueElements
    private String title;

    @NotBlank
    private String word01;

    @NotBlank
    private String word02;

    @NotBlank
    private String word03;

    @NotBlank
    private String word04;

    @NotBlank
    private String word05;

    @NotBlank
    private String word06;

    @NotBlank
    private String word07;

    @NotBlank
    private String word08;

    @NotBlank
    private String word09;

    @NotBlank
    private String word10;

    private String word11;
    private String word12;
    private String word13;
    private String word14;
    private String word15;
    private String word16;
    private String word17;
    private String word18;
    private String word19;
    private String word20;


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

    public String getWord01() {
        return word01;
    }
    public void setWord01(String word01) {
        this.word01 = word01;
    }

    public String getWord02() {
        return word02;
    }
    public void setWord02(String word02) {
        this.word02 = word02;
    }

    public String getWord03() {
        return word03;
    }
    public void setWord03(String word03) {
        this.word03 = word03;
    }

    public String getWord04() {
        return word04;
    }
    public void setWord04(String word04) {
        this.word04 = word04;
    }

    public String getWord05() {
        return word05;
    }
    public void setWord05(String word05) {
        this.word05 = word05;
    }

    public String getWord06() {
        return word06;
    }
    public void setWord06(String word06) {
        this.word06 = word06;
    }

    public String getWord07() {
        return word07;
    }
    public void setWord07(String word07) {
        this.word07 = word07;
    }

    public String getWord08() {
        return word08;
    }
    public void setWord08(String word08) {
        this.word08 = word08;
    }

    public String getWord09() {
        return word09;
    }
    public void setWord09(String word09) {
        this.word09 = word09;
    }

    public String getWord10() {
        return word10;
    }
    public void setWord10(String word10) {
        this.word10 = word10;
    }

    public String getWord11() {
        return word11;
    }
    public void setWord11(String word11) {
        this.word11 = word11;
    }

    public String getWord12() {
        return word12;
    }
    public void setWord12(String word12) {
        this.word12 = word12;
    }

    public String getWord13() {
        return word13;
    }
    public void setWord13(String word13) {
        this.word13 = word13;
    }

    public String getWord14() {
        return word14;
    }
    public void setWord14(String word14) {
        this.word14 = word14;
    }

    public String getWord15() {
        return word15;
    }
    public void setWord15(String word15) {
        this.word15 = word15;
    }

    public String getWord16() {
        return word16;
    }
    public void setWord16(String word16) {
        this.word16 = word16;
    }

    public String getWord17() {
        return word17;
    }
    public void setWord17(String word17) {
        this.word17 = word17;
    }

    public String getWord18() {
        return word18;
    }
    public void setWord18(String word18) {
        this.word18 = word18;
    }

    public String getWord19() {
        return word19;
    }
    public void setWord19(String word19) {
        this.word19 = word19;
    }

    public String getWord20() {
        return word20;
    }
    public void setWord20(String word20) {
        this.word20 = word20;
    }
}
