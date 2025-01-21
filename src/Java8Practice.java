import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Practice {
	
	//function for prime numbers using Stream Api
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		
		return IntStream.rangeClosed(2, (int)Math.sqrt(n))
				.noneMatch(div->n%div==0);
	}
	
	//function to reverse String using Stream api
	public static String reverse(String str) {
		int n=str.length();
		
		return IntStream.rangeClosed(0,n-1)
				.mapToObj(i->str.charAt(n-1-i))
				.map(String::valueOf)
				.collect(Collectors.joining());
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverse("Ambuj"));
		
	//	System.out.println(isPrime(45));
		
//		String str="AmBuj";
//		
//		String str2=str.chars().mapToObj(c->{
//			char ch=(char) c;
//			return (Character.isUpperCase(ch))?Character.toLowerCase(ch):Character.toUpperCase(ch);
//		})
//				.map(String::valueOf)
//				.collect(Collectors.joining());
//		System.out.println(str2);
//		List<String> list=List.of("Mango","Banana","Kiwi");
//		
//		list.stream().forEach(ele->{
//			System.out.println(ele);
//			
//		});;

}
}
