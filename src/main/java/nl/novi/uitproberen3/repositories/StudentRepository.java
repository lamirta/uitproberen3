package nl.novi.uitproberen3.repositories;

import nl.novi.uitproberen3.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

}
