package chap05.Practice05;
// ���� 5-2 : ��� ���迡 �ִ� Ŭ���� �� ��� ����
class Person {
	int age;
	public String name;
	protected int height;
	private int weight;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	int showWeight() {
		return weight;
	}
}
public class Student extends Person{
	void set() {
		age = 22;
		name = "������";
		height = 183;
		setWeight(77);
	}
	void showStudent() {
		System.out.println("����: "+age);
		System.out.println("�̸�: "+name);
		System.out.println("Ű: "+height);
		System.out.println("������: "+showWeight());
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.showStudent();
	}
}