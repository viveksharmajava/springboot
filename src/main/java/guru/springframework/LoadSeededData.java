//package guru.springframework;
//import guru.springframework.domain.*;
//import guru.springframework.repositories.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//public class LoadSeededData {
//
//	public static void main(String[] args) {
//		//SpringApplication.run(LoadSeededData.class, args);
//		   SpringApplication app = new SpringApplication(LoadSeededData.class);
//		   Map <String,Object>  prop  = new HashMap<String,Object>();
//			prop.put("spring.datasource.url", "jdbc:oracle:thin:@//localhost:1521/xe");
//			prop.put("spring.datasource.username", "ecommerce");
//			prop.put("spring.datasource.password", "ecommerce");
//			prop.put("spring.datasource.testWhileIdle", "true");
//			prop.put("spring.datasource.validationQuery", "SELECT 1");
//			prop.put("spring.jpa.show-sql", "true");
//			prop.put("spring.jpa.hibernate.ddl-auto", "create-drop");
//			prop.put("spring.jpa.hibernate.naming.implicit-strategy", "org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl");
//			prop.put("spring.jpa.hibernate.naming.physical-strategy", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
//			prop.put("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
//			prop.put("server.port", "8088");
////			prop.put("", "");
//			
//	      app.setDefaultProperties(prop);
//	      app.run(args);
//	}
//	 @Bean
//	    public CommandLineRunner mappingDemo(FeatureRepository featureRepository,
//	                                         FeatureTypeRepository featureTypeRepo) {
//	        return args -> {
//	        	Feature feature = new Feature();
//	        	feature.setFeatureId("LEAFY");
//	        	feature.setFeatureName("Leafy Vegitables");
//	        	FeatureType featureType = new FeatureType();
//	        	featureType.setTypeId("VEGITABE");
//	        	featureType.setTypeName("Vegitable");
//	        	
//	        	featureTypeRepo.save(featureType);
//	        	
//	        	feature.setFeatureType(featureType);
//	        	featureRepository.save(feature);
//	        	
//	        };
//	 }
//}
