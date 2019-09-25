package java_GettersAndSetters;

/**
 * Example Application: Getters and Setters
 * 
 * @author Felipe Fong
 */
public class Main {

	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Steve");
		person.setFamilyName("Jobs");
		person.setAge(30);

		System.out.println("Full Name: " + person.getFullName());
	}
}
