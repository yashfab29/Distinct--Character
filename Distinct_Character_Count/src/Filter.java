import java.util.function.Predicate;  
import java.util.*; 
import java.util.stream.*; 
  
public class Filter {

	public Predicate<String> nameStartingWithPrefix(String prefix)
	{
		return s -> s.startsWith(prefix);
	}
}
