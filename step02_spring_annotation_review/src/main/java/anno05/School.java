package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	private Student person;
	@Autowired
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
		return "School [person=" + person + ", grade=" + grade + "]";
	}

}
