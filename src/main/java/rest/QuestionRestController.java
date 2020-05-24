package rest;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;

import question.Question;
@RestController
public class QuestionRestController {
//   @Autowired
//   QuestionRepository repository;
   @Autowired	
   private Question question;
   private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
   private  HashMap<String,Question> hm = new HashMap<String,Question>();
   @RequestMapping("/addQuestion") 
   @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
   @PostMapping
   public Question addQuestion(@RequestBody Question questionInbound) {
 	 System.out.println("Add question service called questionInbound"+questionInbound);
 	//Create resource location
     URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                 .path("/1001")
                                 .build()
                                 .toUri();
     
     questionInbound.setQuestionId("4000");
     //Send location in response
    // return ResponseEntity.created(location).build();
	  return questionInbound;
   }
  // @RequestMapping("/deleteQuestion/{questionId}") 
   @DeleteMapping("/deleteQuestion/{questionId}")
   @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
   public Question deleteQuestion(@PathVariable String questionId) {
 	 System.out.println("deleteQuestion questionId="+questionId);
 	 return this.hm.remove(questionId);
 	 
   } 
  @RequestMapping("/getQuestion/{questionId}") 
  @GetMapping
  @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
  public Question getQuestion(@PathVariable String questionId) {
	 System.out.println("questionId="+questionId);
	 LOGGER.info("testAddQuestionSuccess Info");
	 LOGGER.debug("This is a debug message");
	 LOGGER.info("This is an info message");
	 LOGGER.warn("This is a warn message");
	 LOGGER.error("This is an error message");
	
	 //mvn install:install-file -Dfile={/Users/viveksharma/Documents/vivek/jars/ojdbc7.jar} -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
	
	  List <String> option = new LinkedList<String>();
	  option.add("Functional Issue");
	  option.add("Performance Issue");
	  option.add("Crash Issue");
	  option.add("Diagnostic Issue");
	  option.add("Diagnostic Issue2");
	  option.add("Diagnostic Issue3");
	  
	 // Question q = new Question();
	  question.setqText("Issue Type");
	  question.setQuestion_type("radio");
	  question.setQuestionId("1001");
	  List<String> childQuestions = new LinkedList<String>();
	  childQuestions.add("1001_0");
	  question.setChild_questions(childQuestions);
	
	  question.setOptions(option);
	  hm.put("1001",question);
	  //Below code show how to convert java objects to corresponding json value 
	  //how ever spring automatically convert to json if requestion header is set application/json
	  // Approach 1: usgin ObjectMapper
	  ObjectMapper mapper = new ObjectMapper();
	  try {
	    String json = mapper.writeValueAsString(question);
	    //System.out.println("ResultingJSONstring = " + json);
	    //System.out.println(json);
	  } catch (JsonProcessingException e) {
	     e.printStackTrace();
	  }
	  
	  //Approach 2 : Using goole api gson you need to add below dependency to pom.xml
	   /*
	    * <dependency>
		 <groupId>com.google.code.gson</groupId>
		    <artifactId>gson</artifactId> 
		    <version>2.3.1</version>
		 </dependency>
	    */
	   // Gson gson = new Gson();    
	    List <Question> array = new ArrayList<Question>();
	    array.add(question);
	    question=  new Question();
	    question.setqText("Child of Functional Issue");
	    question.setQuestion_type("radio");
	    question.setQuestionId("1001_0");
	    childQuestions = new LinkedList<String>();
		//childQuestions.add("1002_0");
		//question.setChildQuestions(childQuestions);
		option = new LinkedList<String>();
	    option.add("Option 1");
	    option.add("Option 2");
		question.setOptions(option);
		 hm.put("1001_0",question); 
	    array.add(question);
	  //  String json = gson.toJson(array);
	   // System.out.println("gson json="+json);   
	  //Ends here
	   //MongoDB stuff begin here
//	    repository.save(question);
//	    question.setqText("Second Question");
//	    repository.save(question);
//	    
//	    for(Question q : repository.findAll()) {
//	    	System.out.println(q.toString());
//	    }
	    //MongoDB stuff ends here
	   
	  //return  question;
	    return hm.get(questionId);
  }
  
  @RequestMapping("/getQuestions") 
  @GetMapping
  @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
  public List<Question> getQuestions() {
	  System.out.println("\n\n################### \n get Questions API Called !!!\n ###############\n\n\n");
	  List <String> option = new LinkedList<String>();
	  option.add("Functional Issue");
	  option.add("Performance Issue");
	  option.add("Crash Issue");
	  option.add("Diagnostic Issue");
	  
	 // Question q = new Question();
	  question.setqText("Issue Type");
	  question.setQuestion_type("radio");
	  question.setQuestionId("1001");
	  List<String> childQuestions = new LinkedList<String>();
	  childQuestions.add("1001_0");
	  question.setChild_questions(childQuestions);
	  
	  question.setOptions(option);
	  //Below code show how to convert java objects to corresponding json value 
	  //how ever spring automatically convert to json if requestion header is set application/json
	  // Approach 1: usgin ObjectMapper
	  ObjectMapper mapper = new ObjectMapper();
	  try {
	    String json = mapper.writeValueAsString(question);
	   // System.out.println("ResultingJSONstring = " + json);
	    //System.out.println(json);
	  } catch (JsonProcessingException e) {
	     e.printStackTrace();
	  }
	  
	  //Approach 2 : Using goole api gson you need to add below dependency to pom.xml
	   /*
	    * <dependency>
		 <groupId>com.google.code.gson</groupId>
		    <artifactId>gson</artifactId> 
		    <version>2.3.1</version>
		 </dependency>
	    */
	   // Gson gson = new Gson();    
	    List <Question> array = new ArrayList<Question>();
	    array.add(question);
	    question=  new Question();
	    question.setqText("Child of Functional Issue");
	    question.setQuestion_type("radio");
	    question.setQuestionId("1001_0");
	    childQuestions = new LinkedList<String>();
		childQuestions.add("1002_0");
		//question.setChildQuestions(childQuestions);
		 option = new LinkedList<String>();
		 option.add("Option 1");
		 option.add("Option 2");
	     question.setOptions(option);
		  
	    array.add(question);
	   // String json = gson.toJson(array);
	   // System.out.println("gson json="+json);   
	  //Ends here
	   //MongoDB stuff begin here
//	    repository.save(question);
//	    question.setqText("Second Question");
//	    repository.save(question);
//	    
//	    for(Question q : repository.findAll()) {
//	    	System.out.println(q.toString());
//	    }
	    //MongoDB stuff ends here
	   
	  return  array;
  }

}
