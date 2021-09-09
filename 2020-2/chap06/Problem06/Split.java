package chap06.Problem06;
import java.io.*;
import java.util.StringTokenizer;
 
public class Split {
    public static void main(String[] args) {
    	StringBuffer sb = new StringBuffer(); // Ű �Է��� ���� ��Ʈ�� ����
        InputStreamReader rd = new InputStreamReader(System.in);
        try { // Ű����κ��� ���ڿ��� �о� ��Ʈ�� ���ۿ� ������
        	while (true) {
                    int c = rd.read(); // ctrl-z�� �ԷµǸ� -1�� ��ȯ��
                    if (c == -1)
                        break;
                    sb.append((char) c); // ���� ���ڸ� ��Ʈ�� ���ۿ� �߰���
                }
            } 
            catch (IOException e) {
                System.out.println("�Է� ���� �߻�");
                }
            StringTokenizer st = new StringTokenizer(sb.toString(), " "); // StringBuffer�� String���� �ٲ� �� Tokenizer�� �̿��� �и�
            System.out.println("�ܾ��� ����: "+st.countTokens()); // Token ���� ���
    }
}