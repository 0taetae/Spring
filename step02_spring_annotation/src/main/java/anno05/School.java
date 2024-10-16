package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="mySchool")
public class School {
	
	@Autowired
	private Student person;
	
	@Autowired
	@Qualifier(value="grade1")
	private int grade;
	
	public School() {
		super();
	}
	public School(Student person) {
		super();
		this.person = person;
	}
	@Override
	public String toString() {
		return "ABC고등학교 [학생정보=" + person.toString() + ", 학년=" + grade + "]";
	}
	
	
	
}
