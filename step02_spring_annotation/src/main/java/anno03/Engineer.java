package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	
	@Autowired
	@Qualifier(value="emp1")
	private Emp emp;
	
	@Autowired
	@Qualifier(value="dev_dept")
	private String dept;
	
	@Override
	public String toString() {
		return emp.toString()+"\n"+dept+"에 근무합니다";
	}
}
