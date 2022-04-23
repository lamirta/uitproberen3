package nl.novi.uitproberen2.repositories;

import nl.novi.uitproberen2.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
