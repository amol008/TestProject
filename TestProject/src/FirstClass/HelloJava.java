package FirstClass;

import java.util.ArrayList;
import java.util.List;

public class HelloJava {

	public static void main(String[] args) {
		System.out.println("Hello World ..!!!!");

		Person obj1 = new Person(1,"Amol","Randive");
		Person obj2 = new Person(2,"Bmol","Kamble");
		Person obj3 = new Person(3,"Cmol","Madavi");
		List<Person> objPerson = new ArrayList<Person>();
		objPerson.add(obj1);
		objPerson.add(obj2);
		objPerson.add(obj3);

		for(Person obj:objPerson)
		{
			System.out.println("first element = "+obj);
		}
		System.out.println("End of for loop");
	}

}
