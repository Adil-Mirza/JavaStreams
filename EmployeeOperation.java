package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeOperation {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Adil","HR",28));
		list.add(new Employee(101,"Bdil","IT",28));
		list.add(new Employee(101,"Ddil","HR",30));
		list.add(new Employee(101,"Cdil","IT",48));
		
		//list.stream().filter(obj->obj.department.startsWith("I")).forEach(System.out::println);
		//list.stream().map(obj->obj.department.equalsIgnoreCase("HR")).forEach(System.out::println);
		list.stream().filter(obj->obj.getDepartment().equalsIgnoreCase("IT")).forEach(System.out::println);
		list.stream().map(Employee::getName).distinct().forEach(System.out::println);
		
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		Map<String,Double> map2=list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));
		System.out.println(map);
		System.out.println(map2);
	}

}
