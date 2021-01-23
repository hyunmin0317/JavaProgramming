package Practice05;
// 예제 5-2 : 상속 관계에 있는 클래스 간 멤버 접근
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
		name = "최현민";
		height = 183;
		setWeight(77);
	}
	void showStudent() {
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+showWeight());
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.showStudent();
	}
}