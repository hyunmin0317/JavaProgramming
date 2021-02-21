package chap05.Practice05;
// ���� 5-3 : instanceof�� �̿��� ��ü ����
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
			System.out.println("jee�� Student Ÿ��");
		if (jee instanceof Researcher) 
			System.out.println("jee�� Researcher Ÿ��");
		if (kim instanceof Student1)
			System.out.println("kim�� Student Ÿ��");
		if (kim instanceof Professor) 
			System.out.println("kim�� Professor Ÿ��");
		if (kim instanceof Researcher) 
			System.out.println("kim�� Researcher Ÿ��");
		if (kim instanceof Person1)
			System.out.println("kim�� Person Ÿ��");
		if (lee instanceof Professor)
			System.out.println("lee�� Professor Ÿ��");
		if ("java" instanceof String)
			System.out.println("\"java\"�� String Ÿ��");
	}
}