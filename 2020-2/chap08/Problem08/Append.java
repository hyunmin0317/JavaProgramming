package chap08.Problem08;
import java.io.*;
import java.util.Scanner;
// �ǽ� 08-01
public class Append {
    public static void main(String[] args) {
        FileReader f1 = null;	// ù��° ����
        FileReader f2 = null;	// �ι�° ����
        FileWriter f3 = null;	// ���ο� ����
        Scanner sc = new Scanner(System.in);	// ���� �̸��� �Է¹��� Scanner
        try {
            int c;
            f1 = new FileReader("C:\\Java\\JavaProgramming\\src\\Problem08\\"+sc.next()+".txt");
            f2 = new FileReader("C:\\Java\\JavaProgramming\\src\\Problem08\\"+sc.next()+".txt");
            // ���� �̸��� �Է�
            f3 = new FileWriter("C:\\Java\\JavaProgramming\\src\\Problem08\\newfile.txt");
            // ���ο� ���� ����
            while((c = f1.read())!=-1) { // f1�� ������ f3�� �ۼ�
                f3.write(c);
            }
            while((c = f2.read())!=-1) { // f2�� ������ f3�� �ۼ�
                f3.write(c);
            }
            f1.close();
            f2.close();
            f3.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("���� ����� ����");
        }
    }
}