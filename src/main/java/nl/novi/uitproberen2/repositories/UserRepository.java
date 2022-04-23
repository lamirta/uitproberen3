package nl.novi.uitproberen2.repositories;

import nl.novi.uitproberen2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
