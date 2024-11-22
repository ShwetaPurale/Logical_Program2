package stream;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class SortSream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] str= {"snehal", "rahul", "geeta", "neha"};
		List<String> list=Arrays.asList("snehal", "rahul", "geeta", "neha");
		List<String> str1=list.stream().filter(list0->list0.startsWith("s")).collect(Collectors.toList());
		System.out.println(str1);
		
		Integer[] no1= {1,8,9,6,5,7,75,98,52};
		List<Integer> n2=Arrays.asList(no1);
		List<Integer> no=Arrays.asList(1,5,9,8,75,6,85);
		List<Integer> list1=no.stream().sorted().collect(Collectors.toList());
				System.out.println("Asending order "+list1);
				
				List<Integer> list2=no.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
				System.out.println("desending order "+list2);
				
		List<Integer> odd=n2.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		
	}

}
