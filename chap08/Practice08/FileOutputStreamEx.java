package Practice08;
import java.io.*;
// 예제 8-2 : FileOutputStream을 이용한 파일 쓰기
public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:\\test.out");
			FileInputStream fin = null;
			for (int i=0; i<10; i++) {
				int n = 10-i;
				fout.write(n);
			}
			fout.close();
			fin = new FileInputStream("c:\\test.out"); 
			int c=0;
			while ((c = fin.read()) != -1)
				System.out.print(c + " "); 
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}