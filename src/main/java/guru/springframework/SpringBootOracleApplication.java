package guru.springframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import guru.springframework.domain.Catalog;
import guru.springframework.domain.CatalogType;
import guru.springframework.domain.Category;
import guru.springframework.domain.CategoryType;
import guru.springframework.domain.Feature;
import guru.springframework.domain.FeatureType;
import guru.springframework.domain.Product;
import guru.springframework.repositories.CatalogRepository;
import guru.springframework.repositories.CatalogTypeRepository;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.CategoryTypeRepository;
import guru.springframework.repositories.FeatureRepository;
import guru.springframework.repositories.FeatureTypeRepository;
import guru.springframework.repositories.ProductRepository;
import guru.springframework.repositories.ProductTypeRepository;

@SpringBootApplication
public class SpringBootOracleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootOracleApplication.class, args);
		SpringApplication app = new SpringApplication(SpringBootOracleApplication.class);
		Map <String,Object>  prop  = new HashMap<String,Object>();
		prop.put("spring.datasource.url", "jdbc:oracle:thin:@//localhost:1521/xe");
		prop.put("spring.datasource.username", "ecommerce");
		prop.put("spring.datasource.password", "ecommerce");
		prop.put("spring.datasource.testWhileIdle", "true");
		prop.put("spring.datasource.validationQuery", "SELECT 1");
		prop.put("spring.jpa.show-sql", "true");
		prop.put("spring.jpa.hibernate.ddl-auto", "create");//create-drop
		prop.put("spring.jpa.hibernate.naming.implicit-strategy", "org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl");
		prop.put("spring.jpa.hibernate.naming.physical-strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
		prop.put("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		prop.put("server.port", "8088");
//		prop.put("", "");
		
      app.setDefaultProperties(prop);
      app.run(args);
	}
	 @Bean
	    public CommandLineRunner mappingDemo(FeatureRepository featureRepository,
	                                         FeatureTypeRepository featureTypeRepo,
	                                         CatalogTypeRepository catalogTYpeRep,
	                                         CatalogRepository catRep,
	                                         CategoryTypeRepository catTypeRep,
	                                         CategoryRepository cateRep,
	                                         ProductTypeRepository pTypeRep,
	                                         ProductRepository pRep) {
	        return args -> {
	        	
	        	Feature feature = new Feature();
	        	feature.setFeatureId("LEAFY");
	        	feature.setFeatureName("Leafy Vegitables");
	        	FeatureType featureType = new FeatureType();
	        	featureType.setTypeId("VEGITABE");
	        	featureType.setTypeName("Vegitable");
	        	
	        	//featureTypeRepo.save(featureType);
	        	
	        	feature.setFeatureType(featureType);
	        	featureRepository.save(feature);
	        	
	        	CatalogType cataType = new CatalogType();
	        	cataType.setTypeId("FRUITS_VEGITABLES");
	        	cataType.setTypeName("Fruits & Vegitables");
	        	
	        	Catalog cata = new Catalog();
	        	cata.setCatalogId("FRUITS");
	        	cata.setCatalogName("Fruits");
	        	cata.setCatalogType(cataType);
	        	
	        	catRep.save(cata);
	        	
	        	CategoryType catType = new CategoryType();
	        	catType.setTypeId("BANANA");
	        	
	        	Category cat = new Category();
	        	cat.setCategoryId("AVALAKKI");
	        	cat.setCategoryName("Avalakki Banana(Small Banana)");
	        	cat.setCategoryType(catType);
	        	
	        	
	        	
	        	HashSet <Catalog> catalogs = new HashSet<Catalog>();
	        	catalogs.add(cata);
	        	cat.setCatalogs(catalogs);
	        	cateRep.save(cat);
	        	
	        	Product p = new Product();
	        	p.setId(200l);
	        	p.setName("Avalakki Banana(Small Banana)");
	        	HashSet <Category> categories = new HashSet<Category>();
	        	categories.add(cat);
	        	p.setCategories(categories);
	        	
	        	pRep.save(p);
	        	
	        	
	        	Scanner scanner = new Scanner(System.in);
	    		while (scanner.hasNext()) {
	    			
	    			String line = scanner.nextLine();
	    			if("break".equalsIgnoreCase(line)) break;
	    			switch(line)
	    			{
	    			case "byId" :
	    			 Optional<Product> prod  = pRep.findById(1l);
	    			 System.out.println(prod.get());
	    			 break;
	    			case "byName" :
	    			     List<Product> products = pRep.findByName("Avalakki Banana(Small Banana)");
	    			     System.out.println(products);
	    				break;
	    			case "byNameIgnoreCase" :
	    				 List<Product> products2 = pRep.findByNameIgnoreCase("avalakki Banana(Small Banana)");
	    			     System.out.println(products2);
	    			case "byNameLike" :
	    				 Stream<Product> products3 = pRep.findByNameContaining("avalakki");
	    			     System.out.println(products3);
	    				
	    			default:	
	    			}
	    		}
	        	
	        };
	 }
}
