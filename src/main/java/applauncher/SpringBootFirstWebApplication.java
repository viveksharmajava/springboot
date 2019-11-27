package applauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"rest","question","data.mongodb"})
public class SpringBootFirstWebApplication {

//	@Autowired
//	QuestionRepository repository;
//	@Autowired	
//	   private Question question;
	public static void main(String[] args) {

		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		List <String> option = new LinkedList<String>();
//		  option.add("a");
//		  option.add("b");
//		  
//		 // Question q = new Question();
//		  question.setqText("First Question");
//		  List<String> childQuestions = new LinkedList<String>();
//		  childQuestions.add("child 1");
//		  childQuestions.add("child 2");
//		  question.setChildQuestions(childQuestions);
//		  Option o = new Option();
//		  o.setOptions(option);
//		  List <Option> optionList = new <Option> LinkedList();
//		  optionList.add(o);
//		  question.setOptions(optionList);
//		  repository.save(question);
//		  question.setqText("Second Question");
//		  repository.save(question);
//		  for(Question q : repository.findAll()) {
//		    	System.out.println(q.toString());
//		    }
//	}

}
