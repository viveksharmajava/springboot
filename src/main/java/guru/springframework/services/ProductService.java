package guru.springframework.services;

import java.util.List;
import java.util.Optional;

import guru.springframework.commands.ProductForm;
import guru.springframework.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

    Optional<Product> getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
