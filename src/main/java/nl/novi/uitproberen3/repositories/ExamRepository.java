package nl.novi.uitproberen3.repositories;

import nl.novi.uitproberen3.models.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, String> {

}
