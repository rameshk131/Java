package streams;

import java.util.List;
import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		//Q1) Display the Student Data 
		List<Student> slist = DataUtil.getStudents();
		slist.forEach(System.out::println);
		System.out.println("-----------------------------");
		//or 		
		//slist.stream().forEach(s->System.out.println(s));
		
		//Q2) Display the Students who has to pay the Fee Balance.
		slist.stream().filter(stu -> stu.getFeeBal() > 0).forEach(System.out::println);
	}

}
