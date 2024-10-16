package com.ssafy.hello.di8.dao;

import java.util.Calendar;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class HelloDaoImpl implements HelloDao {

	@Override
	public String greeting() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if(hour > 7 && hour < 12) {
			return "좋은 아침 ";
		} else if(hour > 12 && hour < 21) {
			return "즐거운 오후";
		} else {
			return "굿밤 ";
		}
	}

}
