package basics;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Basic4 {

	public static void main(String[] args) {
//		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList());
//		
//		int min=list.stream().min(Integer::compareTo).get();
//		int max=list.stream().max(Integer::compareTo).get();
//		System.out.println("min no is :" + min);
//		System.out.println("max no is :" + max);
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		for(int i=0;  i<5;  i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;  i<5;  i++) {
			System.out.println(arr[i]);
		}

	}

}
