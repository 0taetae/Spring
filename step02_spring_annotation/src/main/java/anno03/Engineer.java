package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component    // 기본값: engineer
public class Engineer {
	@Autowired
	@Qualifier(value="emp1")    //@Autowired, @Qualifier: 스프링 전용 (권장!!)
//	@Resource(name="emp2")      //@Resource: 자바전용 
	private Emp emp;
	
	@Autowired
	@Qualifier(value="dev_dept")
	private String dept;
	
//	public void setEmp(Emp emp) {
//		this.emp = emp;
//	}
//	
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
	
	@Override
	public String toString() {
		return emp.toString() + "\n" + dept +"에 근무합니다";
	}
}
