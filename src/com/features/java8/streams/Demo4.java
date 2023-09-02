package com.features.java8.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("------------10-----------------");
		//Q9) How Many Students has to pay the fee bal from DevOps Course
		
		List<Student> slist = DataUtil.getStudents();
		
		long count = slist.stream().filter(stu -> stu.getFeeBal() > 0)
				.filter(stu->stu.getCourseName().equalsIgnoreCase("DevOps")).count();
		
		System.out.println("Count is  "+count);
		
		List<Student> mylist = slist.stream().filter(stu -> stu.getFeeBal() > 0)
		.filter(stu->stu.getCourseName().equalsIgnoreCase("DevOps"))
		.collect(Collectors.toList());
		 mylist.forEach(System.out::println);
		 
		 
		
	}

}
