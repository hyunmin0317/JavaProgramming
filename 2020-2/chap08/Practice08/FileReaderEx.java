package chap08.Practice08;
import java.io.*;
// ���� 8-3 : FileReader�� �̿��� �ؽ�Ʈ ���� �б� - system.ini ���� �б�
public class FileReaderEx {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("c:\\windows\\system.ini");
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