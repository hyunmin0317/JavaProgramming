package Practice08;
import java.io.*;
// 예제 8-7 : 버퍼 스트림을 이용하는 출력 예제
public class BufferedIOEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
		try {			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			} 
			out.flush();
			if (in != null) {
				in.close();
				out.close();
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}