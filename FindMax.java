package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi there");
		List<Integer> list=Arrays.asList(21,1,2,3);
		Optional<Integer> max=list.stream().max((e1,e2)->e2.compareTo(e1));
		 Integer var = list.stream().max(Integer::compare).get();
//		System.out.println(max.toString());
//		System.out.println(var);
//		System.out.println(Integer.compare(12, 12));
//		
//		Map<Integer, Integer> map=list.stream().collect(Collectors.toMap(x->x ,x->x));
//		System.out.println(map);
		 
		 String[] arr= {"ac", "I","ZZA","Dfc","Longest","Word"};
		// Arrays.stream(arr).map(obj->obj.length()+" "+obj).sorted(Collections.reverseOrder()).forEach(obj->System.out.println(obj));
		 //Arrays.stream(arr).map(obj->obj.length()+" "+obj).sorted(Collections.reverseOrder()).forEach(System.out::println);
		 Arrays.stream(arr).map(obj->obj+" "+obj.length()).sorted().forEach(System.out::println);
	}

}
