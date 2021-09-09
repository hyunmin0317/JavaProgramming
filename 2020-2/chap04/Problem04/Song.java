package chap04.Problem04;
//�ǽ�04-02
public class Song {
	String title;
	String artist;
	String album;
	String composer[];
	int year;
	int track;
	
	public Song() {}	//������ ����
	public Song(String title, String artist, String album, String composer[], int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	void show() {	//�뷡������ ����ϴ� �޼ҵ�
		System.out.println("�뷡 ����: "+title);
		System.out.println("����: "+artist);
		System.out.println("�ٹ� ����: "+album);
		for(int i=0; i<composer.length; i++)
			System.out.println("�۰: "+composer[i]);
		System.out.println("��ǥ ����: "+year);
		System.out.println("Ʈ�� ��ȣ: "+track);
	}
}