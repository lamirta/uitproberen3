package nl.novi.uitproberen3.repositories;

import nl.novi.uitproberen3.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, String> {

}
