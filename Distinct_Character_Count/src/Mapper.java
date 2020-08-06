import java.util.function.Function;

public class Mapper {

	public Function<String, CharactersCount> getDistinctCharactersCount()
	{
	
		
		return obj -> obj.setDistinctCharacterCount( (int) obj.getName().chars().distinct().count()) ;
		
	
	}
}

	
