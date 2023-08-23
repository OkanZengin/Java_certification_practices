package part_nine;

import java.util.List;

public class Make_People_Work{

	public static void makePeopleWork(List<Person> people) { 
		for(Person person : people) {
			person.work();
		}
	}
	public static void makePeopleWork_2(List<? extends Person> people) { 
		for(Person person : people) {
			person.work();
		}
	}
}
