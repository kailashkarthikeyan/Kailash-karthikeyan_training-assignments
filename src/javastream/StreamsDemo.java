package javastream;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(3,6,9,34,45,7,12);
		
		list.stream()
		.filter(x-> x%2==0)
		.forEach(x->System.out.print(x+ " "));
		
		
		list.stream()
		.map(num -> num*num)
		.forEach(num->System.out.println(num+" "));
		
		int sumOfNums =list.stream()
		.reduce(0, (n1,n2) ->n1+n2);
		System.out.println("Sum of the given numbers:"+sumOfNums);
		
		list.stream()
		.sorted()
		.forEach(x->System.out.print(x+" "));//sorting the given elements
		
		List<String> list2=Arrays.asList("Kailash","Roshan","Ajay","Charan","Bharath","ajay");
		list2.stream()
		.filter(x->x.startsWith("A")||x.startsWith("a"))
		.forEach(x->System.out.println(x));//Printing the String names which start with letter A
		
		
		
	}

}
