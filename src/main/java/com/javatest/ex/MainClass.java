package com.javatest.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation1 = "classpath:applicationCTX.xml";
		String configLocation2 = "classpath:applicationCTX1.xml";
		
	    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2); // 컨테이너에 파일 2개 넣기
	    
	    Student student1 = ctx.getBean("student1",Student.class);
	    
	    System.out.println(student1.getName());
	    System.out.println(student1.getAge());
	    System.out.println(student1.getHobbys());
	    
	    System.out.println("======================");
	    
	    StudentInfo studentInfo1 = ctx.getBean("studentInfo1",StudentInfo.class);
	    Student studentHong = studentInfo1.getStudent(); // student1 객체와 동일 
	    
	    System.out.println(studentHong.getName());
	    
	    if(student1.equals(studentHong)) {
	    	System.out.println("student1과 studentHong은 같은 객체입니다.");
	    }
	    
	    System.out.println("======================");
	    
	    Student student2 = ctx.getBean("student2",Student.class);
	    System.out.println(student2.getName());
	    System.out.println(student2.getAge());
	    System.out.println(student2.getHobbys());
	    
	    System.out.println("======================");
	    
	    Family fam = ctx.getBean("family",Family.class);
	    System.out.println(fam.getFather());
	    System.out.println(fam.getMother());
	    System.out.println(fam.getSister());
	    System.out.println(fam.getBrother());
	    
	    
	    ctx.close();
	}

}
