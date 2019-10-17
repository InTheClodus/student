package com.nf.service;

import java.util.Calendar;
import java.util.List;

import com.nf.dao.StudentDao;
import com.nf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	public List<Student> getAllStudents() {

		List<Student> stuList = studentDao.getAllStudents();
		
		
		Calendar calendar = Calendar.getInstance();//储存的时间，就是现在
		int year_now = calendar.get( Calendar.YEAR );
		int month_now =calendar.get( Calendar.MONTH )+1;
		int day_now = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year_now);
		System.out.println(month_now);
		System.out.println(day_now);
		for (Student stu:stuList){
			calendar.setTime(stu.getBirt());
			int year_pass = calendar.get( Calendar.YEAR );
			int month_pass =calendar.get( Calendar.MONTH )+1;
			int day_pass = calendar.get(Calendar.DAY_OF_MONTH);
			int age = year_now - year_pass;
			//还没生日
			if (month_now<month_pass) {
				age--;
			}else if((month_now==month_pass)&&(day_now<day_pass)){
				//不满月
				age--;
			}
			stu.setAge(age);
		}
		return stuList;
	}

}
