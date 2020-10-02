package Problem04;
//실습04-02
public class SongManager {
	public static void main(String[] args) {	//노래 정보 입력
		String[] com = new String[] {"Benny Andersson", "Bjorn Ulvaeus", "Stig Anderson"};
		Song song = new Song("Dancing Queen", "ABBA", "Arrival", com, 1976, 1);
		song.show();	//show 메소드를 통해 노래 정보 출력
	}
}