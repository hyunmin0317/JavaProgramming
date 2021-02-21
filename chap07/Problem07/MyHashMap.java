package chap07.Problem07;
import java.util.*;
// �ǽ� 07-04
public class MyHashMap {
	public static void main(String[] args) {
        HashMap<String, Student> dept = new HashMap<String, Student>();
        Scanner sc = new Scanner(System.in);
        System.out.println("�л� ������ �Է��ϼ���.");
        for(int i=0; i<5;i++){
        	Student st = new Student();
        	System.out.println("\n�л�"+(i+1));
            System.out.print("�̸� �Է�: ");
            st.name=sc.nextLine();
            System.out.print("�а� �Է�: ");
            st.department=sc.nextLine();
            System.out.print("�й� �Է�: ");
            st.classnum=sc.nextLine();
            System.out.print("������� �Է�: ");
            st.averscore=sc.nextDouble();
            dept.put(st.classnum, st);
            sc.nextLine();
        }
        System.out.print("\n�й��� �Է��Ͻÿ� : ");
        Student st = dept.get(sc.next());
        System.out.println("�̸� : "+st.name);
        System.out.println("�а� : "+st.department);
        System.out.println("�й� : "+st.classnum);
        System.out.println("������� : "+st.averscore);
        sc.close();
    }
}