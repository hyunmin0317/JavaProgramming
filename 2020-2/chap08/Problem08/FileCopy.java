package chap08.Problem08;
import java.io.*;
// �ǽ� 08-02
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Java\\JavaProgramming\\src\\Problem08\\a.jpg");
            out = new FileOutputStream("C:\\Java\\JavaProgramming\\src\\Problem08\\b.jpg");
            int c;
            while((c = in.read())!=-1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch(IOException e) {
            System.out.println("���� ����� ����");
        }
    }
}