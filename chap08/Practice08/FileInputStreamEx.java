package chap08.Practice08;
import java.io.*;
// ���� 8-1 : �����쿡 �ִ� system.ini ������ �о� ȭ�鿡 ����ϱ�
public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("c:\\windows\\system.ini");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}