package Practice05;
// 예제 5-3 : instanceof를 이용한 객체 구별
class Person1 {}
class Student1 extends Person1 {}
class Researcher extends Person1 {}
class Professor extends Researcher {}

public class InstanceofExample {
	public static void main(String[] args) {
		Person1 jee= new Student1();
		Person1 kim = new Professor();
		Person1 lee = new Researcher();
		if (jee instanceof Student1) 
			System.out.println("jee는 Student 타입");
		if (jee instanceof Researcher) 
			System.out.println("jee는 Researcher 타입");
		if (kim instanceof Student1)
			System.out.println("kim은 Student 타입");
		if (kim instanceof Professor) 
			System.out.println("kim은 Professor 타입");
		if (kim instanceof Researcher) 
			System.out.println("kim은 Researcher 타입");
		if (kim instanceof Person1)
			System.out.println("kim은 Person 타입");
		if (lee instanceof Professor)
			System.out.println("lee는 Professor 타입");
		if ("java" instanceof String)
			System.out.println("\"java\"는 String 타입");
	}
}