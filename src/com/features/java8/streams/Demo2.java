package com.features.java8.streams;

import java.util.List;


public class Demo2 {

	public static void main(String[] args) {
		System.out.println("------------begin-----------------");
		
		//3) Display the Students in Ascending Order by Name.
		
		List<Student> slist = DataUtil.getStudents();
		slist.stream().sorted((stu1, stu2)-> {
			return stu1.getSname().compareTo(stu2.getSname());			
		}).forEach(System.out::println);		
		System.out.println("-----------------------------");
		
		//Q4) Display the Students who has to pay the Fee Balance in Descending Order by Name. 

		slist.stream().filter(s->s.getFeeBal()>0)
					  .sorted((s1,s2) -> { return s2.getSname().compareTo(s1.getSname());})
					  .forEach(System.out::println);
	}

}
