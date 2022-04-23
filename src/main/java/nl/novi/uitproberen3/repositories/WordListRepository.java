package nl.novi.uitproberen3.repositories;

import nl.novi.uitproberen3.models.WordList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordListRepository extends JpaRepository<WordList, String> {

}
