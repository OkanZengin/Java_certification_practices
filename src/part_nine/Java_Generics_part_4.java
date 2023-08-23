package part_nine;

import java.util.ArrayList;

public class Java_Generics_part_4 {

	public static void main(String[] args) {
		
		Person person_a = new Person("Ali",22,"Student");
		Student student_a = new Student("Aslan",23,"Student");
		Teacher teacher_a = new Teacher("Aylin",41,"Teacher");

//		person_a = student_a;
//		person_a = teacher_a;
//		student_a = teacher_a; ==> Won't work.

		ArrayList<Person> people = new ArrayList<>();
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Teacher> teachers = new ArrayList<>();
		people.add(new Person("Burcu",44,"Teacher"));
		students.add(new Student("Burak",21,"Student"));		
		teachers.add(new Teacher("Ceyhun",43,"Teacher"));
//		people = students;       ==> Won't work.
//		people = teachers;  	 ==> Won't work.
		
		ArrayList<Object> people_2 = new ArrayList<>();
		ArrayList<Student> students_2 = new ArrayList<>();
		ArrayList<Teacher> teachers_2 = new ArrayList<>();
//		people_2 = students_2;       ==> Won't work.
//		people_2 = teachers_2        ==> Won't work.
		people_2.add(new Person("Cihan",24,"Student"));
		students_2.add(new Student("Ceylin",25,"Student"));		
		teachers_2.add(new Teacher("Demir",46,"Teacher"));

		ArrayList<?> people_3 = new ArrayList<>();
		ArrayList<Student> students_3 = new ArrayList<>();
		ArrayList<Teacher> teachers_3 = new ArrayList<>();
		people_3 = students_3;
		people_3 = teachers_3;

//		people_3.add(new Person());		==> Won't work.
		students_3.add(new Student("Deniz",20,"Student"));		
		teachers_3.add(new Teacher("Durmuş",54,"Teacher"));
		
		// Upper Bound
		ArrayList<? extends Person> people_4 = new ArrayList<>();
		ArrayList<Student> students_4 = new ArrayList<>();
		ArrayList<Teacher> teachers_4 = new ArrayList<>();
//		people_4 = students_4;
//		people_4 = teachers_4;

//		people_4.add(new Person());		==> Won't work.
		students_4.add(new Student("Erhan",22,"Student"));		
		teachers_4.add(new Teacher("Erkan",60,"Teacher"));
		
		//UpperBound
		ArrayList<? super Person> people_5 = new ArrayList<>();
		ArrayList<Student> students_5 = new ArrayList<>();
		ArrayList<Teacher> teachers_5 = new ArrayList<>();
//		people_5 = students_5;      ==> Won't work.
//		people_5 = teachers_5		==> Won't work.

		people_5.add(new Person("Faruk",34,"Student"));
		students_5.add(new Student("Fatih",26,"Student"));		
		teachers_5.add(new Teacher("Gökhan",44,"Teacher"));
		
		
		// Lower Bound
		ArrayList<? super Person> people_6 = new ArrayList<>();
		ArrayList<Student> students_6 = new ArrayList<>();
		ArrayList<Teacher> teachers_6 = new ArrayList<>();
//		people_6 = students_6;		==> Won't work.
//		people_6 = teaachers_6;		==> Won't work.

		people_6.add(new Person("Hüseyin",25,"Student"));
		students_6.add(new Student("Harun",22,"Student"));		
		teachers_6.add(new Teacher("Kemal",56,"Teacher"));
		
		System.out.println(person_a);
		System.out.println(student_a);
		System.out.println(teacher_a);
		System.out.println("\nFirst batch");
		Make_People_Work.makePeopleWork(people);
//		Make_People_Work.makePeopleWork(students); ==> Won't work.
//		Make_People_Work.makePeopleWork(teachers); ==> Won't work.
		Make_People_Work.makePeopleWork_2(students);
		Make_People_Work.makePeopleWork_2(teachers);
		System.out.println("\nSecond batch");
//		Make_People_Work.makePeopleWork_2(people_2); 	 ==> Won't work.
		Make_People_Work.makePeopleWork_2(teachers_2);
		Make_People_Work.makePeopleWork_2(students_2);
		System.out.println("\nThird batch");
//		Make_People_Work.makePeopleWork_2(people_3);	 ==> Won't work.
		Make_People_Work.makePeopleWork_2(teachers_3);
		Make_People_Work.makePeopleWork_2(students_3);
		System.out.println("\nFourth batch");
		Make_People_Work.makePeopleWork_2(people_4); 
		Make_People_Work.makePeopleWork_2(teachers_4);
		Make_People_Work.makePeopleWork_2(students_4);
		System.out.println("\nFifth batch");
//		Make_People_Work.makePeopleWork_2(people_5);	 ==> Won't work.
		Make_People_Work.makePeopleWork_2(teachers_5);
		Make_People_Work.makePeopleWork_2(students_5);
		System.out.println("\nSixth batch");
//		Make_People_Work.makePeopleWork_2(people_6);	 ==> Won't work.
		Make_People_Work.makePeopleWork_2(teachers_6);
		Make_People_Work.makePeopleWork_2(students_6);

	}

}
