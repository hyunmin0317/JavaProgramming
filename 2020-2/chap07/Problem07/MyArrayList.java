package chap07.Problem07;
import java.util.*;
// �ǽ� 07-03
class Student {
    String name;
    String department;
    String classnum;
    double averscore;
    public Student() {
    }
    public Student(String name, String department, String classnum, Double averscore) {
        this.name=name;
        this.department=department;
        this.classnum=classnum;
        this.averscore=averscore;
        }
    }
public class MyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<Student>();
        System.out.println("�л� ������ �Է��ϼ���.");
        for(int i=0;i<5;i++) //5�� �ݺ�
        {
        	System.out.println("\n�л�"+(i+1));
            System.out.print("�̸� �Է�: ");
            String name=sc.nextLine();
            System.out.print("�а� �Է�: ");
            String department=sc.nextLine();
            System.out.print("�й� �Է�: ");
            String classnum=sc.nextLine();
            System.out.print("������� �Է�: ");
            double averscore=sc.nextDouble();
            Student tmp = new Student(name,department,classnum,averscore);
            st.add(tmp);
            sc.nextLine();
        }
        sc.close();
        for(int i=0;i<st.size();i++){
            Student res = st.get(i);
            System.out.println("\n�л�"+(i+1));
            System.out.println("�̸�: "+res.name);
            System.out.println("�а�: "+res.department);
            System.out.println("�й�: "+res.classnum);
            System.out.println("�������: "+res.averscore);
        }
    }
}