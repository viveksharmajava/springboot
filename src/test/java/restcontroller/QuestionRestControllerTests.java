//package restcontroller;
//
//
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.LinkedList;
//import java.util.List;
//import org.slf4j.Logger;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.embedded.LocalServerPort;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import question.Question;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT, classes = applauncher.SpringBootFirstWebApplication.class)
//public class QuestionRestControllerTests 
//{
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//    
//    @LocalServerPort
//    int randomServerPort;
//    
//    @Autowired
//    Question question;
//
//    @Test
//    public void testAddQuestionSuccess() throws URISyntaxException 
//    {
////    	 LOGGER.info("testAddQuestionSuccess Info");
////    	 LOGGER.debug("This is a debug message");
////    	 LOGGER.info("This is an info message");
////    	 LOGGER.warn("This is a warn message");
////    	 LOGGER.error("This is an error message");
//    	 String baseUrl = "http://localhost:"+randomServerPort+"/addQuestion";
//    	//baseUrl = "http://localhost:"+randomServerPort+"/getQuestion/1001";
//       URI uri = new URI(baseUrl);
//        List <String> option = new LinkedList<String>();
//  	  option.add("Functional Issue");
//  	  option.add("Performance Issue");
//  	  option.add("Crash Issue");
//  	  option.add("Diagnostic Issue");
//  	  
//  	 // Question q = new Question();
//  	  question.setqText("Issue Type");
//  	  question.setQuestion_type("radio");
//  	  question.setOptions(option);
//  	 // question.setQuestionId("1001");
//        HttpHeaders headers = new HttpHeaders();
//        //headers.set("X-COM-PERSIST", "true");      
//        headers.set("Content-Type","application/json");
//        String json=null;
//        ObjectMapper mapper = new ObjectMapper();
//  	  try {
//  		json = mapper.writeValueAsString(question);
//  	    System.out.println("ResultingJSONstring = " + json);
//  	    //System.out.println(json);
//  	  } catch (JsonProcessingException e) {
//  	     e.printStackTrace();
//  	  }
//        HttpEntity<String> request = new HttpEntity<String>(json, headers);
//        //HttpEntity request = new HttpEntity( headers); 
//        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
//        System.out.println(result.getStatusCodeValue());
//        System.out.println(result.getBody());
//        try {
//			Thread.sleep(500000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        //Verify request succeed
//        Assert.assertEquals(201, result.getStatusCodeValue());
//    }
//    
////    @Test
////    public void testAddEmployeeMissingHeader() throws URISyntaxException 
////    {
////        final String baseUrl = "http://localhost:"+randomServerPort+"/employees/";
////        URI uri = new URI(baseUrl);
////        Employee employee = new Employee(null, "Adam", "Gilly", "test@email.com");
////        
////        HttpHeaders headers = new HttpHeaders();
////
////        HttpEntity<Employee> request = new HttpEntity<>(employee, headers);
////        
////        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
////        
////        //Verify bad request and missing header
////        Assert.assertEquals(400, result.getStatusCodeValue());
////        Assert.assertEquals(true, result.getBody().contains("Missing request header"));
////    }
//
//}
