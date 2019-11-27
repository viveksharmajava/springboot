package question;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

//@RepositoryRestResource(collectionResourceRel = "question", path = "test.question")

public interface QuestionRepository extends MongoRepository<Question , String> {

	public Question findById(String qId);
	public List<Question> findByQText(String qText);
}
