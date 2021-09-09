package chap08.Problem08;
import java.io.*;
// �ǽ� 08-03
public class FileCopy2 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out =null;
        try {
            in = new FileInputStream("C:\\Java\\JavaProgramming\\src\\Problem08\\a.jpg");
            out = new FileOutputStream("C:\\Java\\JavaProgramming\\src\\Problem08\\b.jpg");
            int c;
            int total = in.available();	// ��ü ����
            int count=0;	 // ���� ����
            while((c = in.read())!=-1) {
            	if(count==total/10) { // 10% ���� ������ 
                    System.out.print("*");
                    count = 0; // ������ �ʱ�ȭ
                }
                out.write(c);
                count++;
            }
            in.close();
            out.close();
        } catch(IOException e) {
            System.out.println("���� ����� ����");
        }
    }
}