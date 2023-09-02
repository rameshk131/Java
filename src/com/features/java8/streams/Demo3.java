package com.features.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("------------5-----------------");

		// Q5) Find the Students whose feebal >=12000, Add 1000 to all of them
		// Sort them in Descending Order by FeeBal and Store the Result in List.

		List<Student> slist = DataUtil.getStudents();

		List<Student> result = slist.stream().filter(stu -> stu.getFeeBal() >= 12000)
											 .map(stu ->{ stu.setFeeBal(stu.getFeeBal() + 1000);
											 			  return stu;
											 			})
											 .sorted((s1, s2) -> (int) (s2.getFeeBal() - s1.getFeeBal()))
											 .collect(Collectors.toList());

		result.forEach(System.out::println);

		System.out.println("-------------6----------------");
		
		//Q6) Display the Students who joined for DevOps Course. 
		 slist.stream().filter(stu->{return stu.getCourseName().equalsIgnoreCase("DevOps");}).forEach(System.out::println);
		 
		 System.out.println("-----------7------------------");
		 
		 //Q7) Display the Students who joined for DevOps Course in ASC Order by Name
		 slist.stream().filter(stu->{ return stu.getCourseName().equalsIgnoreCase("DevOps");}).sorted((s1,s2)-> s1.getSname().compareTo(s2.getSname()))
		 .forEach(System.out::println);
		 
		 System.out.println("-----------8------------------");		 
		 //Q8) Display the Students who joined for DevOps Course in DESC Order by Name
		 slist.stream().filter(stu->{ return stu.getCourseName().equalsIgnoreCase("DevOps");}).sorted((s1,s2)-> s2.getSname().compareTo(s1.getSname()))
		 .forEach(System.out::println);
		 System.out.println("-----------9------------------");
		 //Q9) How Many Students has to pay the fee bal from DevOps Course 
		 //slist.stream().filter(stu-> { return (stu.getFeeBal() > 0);}).filter(stu->{ return stu.getCourseName().equalsIgnoreCase("DevOps");}).forEach(System.out::println);
		 		 
		 slist.stream().filter(stu-> { return stu.getFeeBal() >0 && stu.getCourseName().equalsIgnoreCase("DevOps");			 
		 }).forEach(System.out::println);
		 
		 
	}

}
