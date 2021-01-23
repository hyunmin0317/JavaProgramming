package Problem08;
import java.io.*;
// 실습 08-03
public class FileCopy2 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out =null;
        try {
            in = new FileInputStream("C:\\Java\\JavaProgramming\\src\\Problem08\\a.jpg");
            out = new FileOutputStream("C:\\Java\\JavaProgramming\\src\\Problem08\\b.jpg");
            int c;
            int total = in.available();	// 전체 개수
            int count=0;	 // 현재 개수
            while((c = in.read())!=-1) {
            	if(count==total/10) { // 10% 진행 됐을때 
                    System.out.print("*");
                    count = 0; // 진행율 초기화
                }
                out.write(c);
                count++;
            }
            in.close();
            out.close();
        } catch(IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }
}