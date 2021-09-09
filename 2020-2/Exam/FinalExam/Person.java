package Exam.FinalExam;
import java.util.Scanner;
import java.lang.Math;

public class Person {
	String name;
	int n1, n2;
	Scanner sc = new Scanner(System.in);
	Person(String name) {
		this.name = name;
	}
	public boolean gamble() {
			System.out.println(name+":");
			n1 = (int)Math.round(Math.random()*2);
			n2 = (int)Math.round(Math.random()*2);
			System.out.println("���� �߻� ���: "+n1+", "+n2+"\n");
			if(n1 == n2)
				return true;
			else
				return false;
		}
	}