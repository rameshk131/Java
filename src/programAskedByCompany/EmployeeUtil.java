package programAskedByCompany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeUtil {

	public static List<Employee> filterEmployees(List<Employee> employeelist) {
		// todo - filter the input and find all unique employees,
		// if we encounter a duplicate, comparision should be done on updated_date and
		// get more recent one
				
		Map<Integer,Employee> map = new HashMap<>();
		for(Employee  e : employeelist) {		
			
			if(map.containsKey(e.getEmployeeId())) {
				
				Employee oldEmp = map.get(e.getEmployeeId());
				if(e.getUpdated_date().after(oldEmp.getUpdated_date())) {
					map.put(e.getEmployeeId(), e);
				}
								
			}else {				
				map.put(e.getEmployeeId(), e);				
			}			
		}
		
		map.values().forEach(e->System.out.println(e));
		
		return null;

	}

	public static void main(String[] args) throws ParseException {
		
		List<Employee> inputList = new ArrayList<>();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");		
		Employee emp1 = new Employee(100,"ramesh",5000, simpleDateFormat.parse("2021-12-06"));
		Employee emp2 = new Employee(200,"saras",5000, simpleDateFormat.parse("2023-12-06"));
		Employee emp3 = new Employee(500,"kabya",5000, simpleDateFormat.parse("2021-12-04"));
		Employee emp4 = new Employee(300,"suresh",5000, simpleDateFormat.parse("2021-12-05"));
		Employee emp5 = new Employee(100,"Biva",5000, simpleDateFormat.parse("2022-12-06"));
		inputList.add(emp1);
		inputList.add(emp2);
		inputList.add(emp3);
		inputList.add(emp4);
		inputList.add(emp5);		
		filterEmployees(inputList);

	}

}
