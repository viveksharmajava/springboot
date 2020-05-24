package guru.springframework.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.domain.Product;
import guru.springframework.services.ProductService;

@RestController
public class ProductRestController {
	 @Autowired 
	 private ProductService productService;
	 
//	  @Autowired
//	    public void setProductService(ProductService productService) {
//	        this.productService = productService;
//	    }
	    @RequestMapping("/rest/product/list")
	    @GetMapping
	    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	    public List<Product> listProducts(){
	        
	        return productService.listAll();
	    }
}
