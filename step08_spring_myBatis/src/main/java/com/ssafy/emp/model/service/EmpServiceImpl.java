package com.ssafy.emp.model.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssafy.emp.model.Emp;
import com.ssafy.emp.model.dao.EmpDao;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	//private EmpDao empDao;
	private SqlSession sqlSession;
	
	@Transactional
	@Override
	public boolean insertEmp(Emp emp) {
		return sqlSession.getMapper(EmpDao.class).insertEmp(emp);
	}

	@Override
	public List<Emp> listEmp() {
		return sqlSession.getMapper(EmpDao.class).listEmp();
	}

	@Override
	public List<Emp> getEmpByEnoAndDept(Map<String, String> map) {
		return sqlSession.getMapper(EmpDao.class).getEmpByEnoAndDept(map);
	}

	@Override
	public Emp searchNo(int eno) {
		return sqlSession.getMapper(EmpDao.class).searchNo(eno);
	}
	
	@Transactional
	@Override
	public boolean updateEmp(Emp emp) {
		return sqlSession.getMapper(EmpDao.class).updateEmp(emp);
	}
	
	@Transactional
	@Override
	public void deleteEmp(int eno) {
		sqlSession.getMapper(EmpDao.class).deleteEmp(eno);
	}

}
