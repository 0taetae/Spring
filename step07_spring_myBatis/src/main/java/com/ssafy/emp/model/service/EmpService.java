package com.ssafy.emp.model.service;

import java.util.List;
import java.util.Map;
import com.ssafy.emp.model.Emp;

public interface EmpService {
	public boolean insertEmp(Emp emp);
	public List<Emp> listEmp();
	public List<Emp> getEmpByEnoAndDept(Map<String, String> map);
	public Emp searchNo(int eno);
	public boolean updateEmp(Emp emp);
	public void deleteEmp(int eno);
}
