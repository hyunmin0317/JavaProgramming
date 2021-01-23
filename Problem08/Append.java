package Problem08;
import java.io.*;
import java.util.Scanner;
// 실습 08-01
public class Append {
    public static void main(String[] args) {
        FileReader f1 = null;	// 첫번째 파일
        FileReader f2 = null;	// 두번째 파일
        FileWriter f3 = null;	// 새로운 파일
        Scanner sc = new Scanner(System.in);	// 파일 이름을 입력받을 Scanner
        try {
            int c;
            f1 = new FileReader("C:\\Java\\JavaProgramming\\src\\Problem08\\"+sc.next()+".txt");
            f2 = new FileReader("C:\\Java\\JavaProgramming\\src\\Problem08\\"+sc.next()+".txt");
            // 파일 이름을 입력
            f3 = new FileWriter("C:\\Java\\JavaProgramming\\src\\Problem08\\newfile.txt");
            // 새로운 파일 생성
            while((c = f1.read())!=-1) { // f1의 내용을 f3에 작성
                f3.write(c);
            }
            while((c = f2.read())!=-1) { // f2의 내용을 f3에 작성
                f3.write(c);
            }
            f1.close();
            f2.close();
            f3.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }
}