package com.ssafy.emp.model.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssafy.emp.model.Emp;
import com.ssafy.emp.model.dao.EmpDao;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;
	
	@Override
	public boolean insertEmp(Emp emp) {
		return empDao.insertEmp(emp);
	}

	@Override
	public List<Emp> listEmp() {
		return empDao.listEmp();
	}

	@Override
	public List<Emp> getEmpByEnoAndDept(Map<String, String> map) {
		return empDao.getEmpByEnoAndDept(map);
	}

	@Override
	public Emp searchNo(int eno) {
		return empDao.searchNo(eno);
	}

	@Override
	public boolean updateEmp(Emp emp) {
		return empDao.updateEmp(emp);
	}

	@Override
	public void deleteEmp(int eno) {
		empDao.deleteEmp(eno);
	}

}
