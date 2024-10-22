package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	@Autowired
	private Emp emp;
	@Autowired
	private String dept;

	@Override
	public String toString() {
		return emp.toString()+"Engineer [emp=" + emp + ", dept=" + dept + "]";
	}
	
	
}
