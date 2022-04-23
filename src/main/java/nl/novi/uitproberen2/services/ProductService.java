package nl.novi.uitproberen2.services;

import nl.novi.uitproberen2.models.Product;

import java.util.Collection;

public interface ProductService {
    // keyword abstract mag ook weg, want methods in interfaces hebben per definitie geen body.
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
    public Collection<Product> getProducts();

}
