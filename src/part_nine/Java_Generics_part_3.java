package part_nine;

import java.util.LinkedHashSet;
import java.util.Set;

public class Java_Generics_part_3 {
	// G is for "Generic"
	public static <G> Set<G> unifier(Set<G> data1, Set<G> data2) {
		
		Set<G> result = new LinkedHashSet<>();
		result.addAll(data1);
		result.addAll(data2);
		return result;
		
	}
}
