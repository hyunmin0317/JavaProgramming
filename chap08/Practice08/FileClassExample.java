package chap08.Practice08;
import java.io.File;
// ���� 8-8 : File Ŭ���� Ȱ���� ���� ����
public class FileClassExample {
	public static void dir(File fd) {
		String[] filenames = fd.list(); 
		for (String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t���� ũ��: " + f.length());
			System.out.printf("\t������ �ð�: %tb %td %ta %tT\n",t, t, t, t);
		}		
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("c:\\tmp\\java_sample");
		File f3 = new File("c:\\tmp");
		String res;
		if(f1.isFile())
			res = "����";
		else
			res = "���͸�";
		System.out.println(f1.getPath() + "�� " + res + "�Դϴ�.");
		if (!f2.exists()) {
			if (!f2.mkdir())
				System.out.println("���͸� ���� ����");
		}
		if(f2.isFile())
			res = "����";
		else
			res = "���͸�";
		System.out.println(f2.getPath() + "�� " + res + "�Դϴ�.");
		dir(f3);
		f2.renameTo(new File("c:\\tmp\\javasample")); 	
		dir(f3);
	}
}