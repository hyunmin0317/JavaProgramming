package Practice08;
import java.io.*;
// 예제 8-6 : 키보드 입력을 파일로 저장하기
public class FileWriterEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		int c;		
		try {
			fout = new FileWriter("c:\\tmp\\test.txt");
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}