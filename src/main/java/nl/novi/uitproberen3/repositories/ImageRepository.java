package nl.novi.uitproberen3.repositories;

import nl.novi.uitproberen3.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, String> {

//    Optional<Image> existsByName(String imageName);

}
