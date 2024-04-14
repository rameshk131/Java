package streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		System.out.println("------------1-----------------");
		////Q10) Which Student has Paid Fee more (max)
		List<Student> slist = DataUtil.getStudents();
		Optional<Student> ops = slist.stream().max((s1,s2)-> (int)(s1.getFeePaid()-s2.getFeePaid()));
		if(ops.isPresent()){			
			System.out.println(ops.get());			
		}
		
	}

}
