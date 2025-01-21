package sigma;

import java.util.PriorityQueue;
//comparable interface is present in java.lang.Comparable; package which is by default imported by compiler, we don't need to import that
public class HeapsPriorityQueue {
	
	static class Student implements Comparable<Student>{
		String name;
		int rank;
		
		public Student(String name,int rank) {
			this.name=name;
			this.rank=rank;
		}

		@Override
		public int compareTo(Student s2) {
			// TODO Auto-generated method stub
			return s2.rank-this.rank;//if ==0, both obj are equal in val
			              //descending order as this.rank is pre existing obj           //if +ve, 2nd is samller, will swap for ascending order
			                         //if -ve, 2nd is greater, no swapping ,already in ascending order(no swapping for -ve result)
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		
		pq1.add(7);
		pq1.add(9);
		pq1.add(1);
		pq1.add(90);
		
		while(!pq1.isEmpty()) {
			System.out.println(pq1.remove());
		}
		PriorityQueue<Student> pq=new PriorityQueue<Student>();
		
		pq.add(new Student("ambuj",600));
		pq.add(new Student("dilip",200));
		pq.add(new Student("praneel",1000));
		pq.add(new Student("rohan",400));
		
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name +"->" + pq.peek().rank);
			pq.remove();
		}
		
	}

}
