package Exam.FinalExam;
import java.io.*;

public class TextCopy {
	public static void main(String[] args) {
		FileReader f1 = null;
		FileWriter f2 = null;
		try {
            int c;
            f1 = new FileReader(args[0]);
            f2 = new FileWriter(args[1]);

            while((c = f1.read())!=-1)
                f2.write(c);
            
            System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
            f1.close();
            f2.close();
        } catch (IOException e) {
            System.out.println("���� ����� ����");
        }
	}
}