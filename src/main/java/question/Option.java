package question;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Option {

  List <String> Options = new LinkedList<String>();

public Option(List<String> options) {
	super();
	Options = options;
}

public Option() {
}

public List<String> getOptions() {
	return Options;
}

public void setOptions(List<String> options) {
	Options = options;
}
public void addOption(String option) {
	Options.add(option);
} 
}
