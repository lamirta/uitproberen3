package nl.novi.uitproberen2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "wordlists")
public class WordList {

    @Id
    @Column(nullable = false, unique = true)
    private String title;

//    @Column
//    private List<Object>;

}
