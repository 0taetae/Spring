package com.ssafy.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.ssafy.emp.model.Emp;
import com.ssafy.emp.util.SqlMapConfig;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Override
	public boolean insertEmp(Emp emp) {
		SqlSession session=SqlMapConfig.getSqlSession();
		int n=session.insert("my.empMapper.insertEmp", emp);
		return (n>0)?true:false;
	}

	@Override
	public List<Emp> listEmp() {
		SqlSession session=SqlMapConfig.getSqlSession();
		return session.selectList("my.empMapper.listEmp");
	}
	/*
	selectList(): 여러건의 데이터  ==> ex) List<Emp> list
	selectOne() : 1건의 데이터    ==> ex) Emp ob
	*/

	@Override
	public List<Emp> getEmpByEnoAndDept(Map<String, String> map) {
		SqlSession session=SqlMapConfig.getSqlSession();
		return session.selectList("my.empMapper.getEmpByEnoAndDept", map);
	}

	@Override
	public Emp searchNo(int eno) {
		SqlSession session=SqlMapConfig.getSqlSession();
		return session.selectOne("my.empMapper.searchNo", eno);
	}

	@Override
	public boolean updateEmp(Emp emp) {
		SqlSession session=SqlMapConfig.getSqlSession();
		int n=session.update("my.empMapper.updateEmp", emp);
		return (n>0)?true:false;
	}

	@Override
	public void deleteEmp(int eno) {
		SqlSession session=SqlMapConfig.getSqlSession();
		session.delete("my.empMapper.deleteEmp", eno);
	}

}
