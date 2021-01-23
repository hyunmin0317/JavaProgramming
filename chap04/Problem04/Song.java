package Problem04;
//실습04-02
public class Song {
	String title;
	String artist;
	String album;
	String composer[];
	int year;
	int track;
	
	public Song() {}	//생성자 지정
	public Song(String title, String artist, String album, String composer[], int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	void show() {	//노래정보를 출력하는 메소드
		System.out.println("노래 제목: "+title);
		System.out.println("가수: "+artist);
		System.out.println("앨범 제목: "+album);
		for(int i=0; i<composer.length; i++)
			System.out.println("작곡가: "+composer[i]);
		System.out.println("발표 연도: "+year);
		System.out.println("트랙 번호: "+track);
	}
}