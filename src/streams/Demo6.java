package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("------------1-----------------");
		//Q13) Display the Students Course-wise. 

		List<Student> slist = DataUtil.getStudents();
		//Map<String, List<Student>> smap = slist.stream().collect(Collectors.groupingBy(s1->s1.getCourseName(),Collectors.toList()));
		Map<String, List<Student>> smap = slist.stream().collect(Collectors.groupingBy(Student::getCourseName));
		
		System.out.println(smap);
		
	}

}
