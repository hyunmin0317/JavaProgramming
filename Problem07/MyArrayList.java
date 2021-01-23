package Problem07;
import java.util.*;
// 실습 07-03
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
        System.out.println("학생 정보를 입력하세요.");
        for(int i=0;i<5;i++) //5번 반복
        {
        	System.out.println("\n학생"+(i+1));
            System.out.print("이름 입력: ");
            String name=sc.nextLine();
            System.out.print("학과 입력: ");
            String department=sc.nextLine();
            System.out.print("학번 입력: ");
            String classnum=sc.nextLine();
            System.out.print("학점평균 입력: ");
            double averscore=sc.nextDouble();
            Student tmp = new Student(name,department,classnum,averscore);
            st.add(tmp);
            sc.nextLine();
        }
        sc.close();
        for(int i=0;i<st.size();i++){
            Student res = st.get(i);
            System.out.println("\n학생"+(i+1));
            System.out.println("이름: "+res.name);
            System.out.println("학과: "+res.department);
            System.out.println("학번: "+res.classnum);
            System.out.println("학점평균: "+res.averscore);
        }
    }
}