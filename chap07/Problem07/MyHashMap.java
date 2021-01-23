package Problem07;
import java.util.*;
// 실습 07-04
public class MyHashMap {
	public static void main(String[] args) {
        HashMap<String, Student> dept = new HashMap<String, Student>();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 정보를 입력하세요.");
        for(int i=0; i<5;i++){
        	Student st = new Student();
        	System.out.println("\n학생"+(i+1));
            System.out.print("이름 입력: ");
            st.name=sc.nextLine();
            System.out.print("학과 입력: ");
            st.department=sc.nextLine();
            System.out.print("학번 입력: ");
            st.classnum=sc.nextLine();
            System.out.print("학점평균 입력: ");
            st.averscore=sc.nextDouble();
            dept.put(st.classnum, st);
            sc.nextLine();
        }
        System.out.print("\n학번을 입력하시오 : ");
        Student st = dept.get(sc.next());
        System.out.println("이름 : "+st.name);
        System.out.println("학과 : "+st.department);
        System.out.println("학번 : "+st.classnum);
        System.out.println("학점평균 : "+st.averscore);
        sc.close();
    }
}