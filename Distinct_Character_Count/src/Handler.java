import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharactersCount chr = new CharactersCount();
		
		ArrayList<String> name=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Name String.");
		name.add("aaaryan");
		name.add("aaryan");
		name.add("ayaan");
		name.add("ravan");
		name.add("aasryan");
		
		String prefix="";
		
		ArrayList<String> result=new ArrayList<String>();
		
		System.out.println("enter prefix");
		
		prefix=sc.nextLine();
		Filter flt=new Filter();
		Predicate<String> predicate=flt.nameStartingWithPrefix(prefix);
		
		result=(ArrayList<String>) name.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(result.toString());
			
//		Mapper mp=new Mapper();
//		result.stream().map(mp.getDistinctCharactersCount()).forEach(System.out::println); 
//			
		
		result.stream().map(l -> l.chars().distinct().count()).forEach(System.out::println);
		
		
//		ArrayList<CharactersCount> c=new ArrayList<CharactersCount>();
//		
//		c=result.stream().map((CharactersCount)l -> 
//						{
//							chr.setName(l);
//							chr.setDistinctCharacterCount( (int) chr.getName().chars().distinct().count());
//							return chr;
//						});		
		
	}

}
