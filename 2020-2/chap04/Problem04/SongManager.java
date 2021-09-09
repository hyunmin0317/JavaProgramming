package chap04.Problem04;
//�ǽ�04-02
public class SongManager {
	public static void main(String[] args) {	//�뷡 ���� �Է�
		String[] com = new String[] {"Benny Andersson", "Bjorn Ulvaeus", "Stig Anderson"};
		Song song = new Song("Dancing Queen", "ABBA", "Arrival", com, 1976, 1);
		song.show();	//show �޼ҵ带 ���� �뷡 ���� ���
	}
}