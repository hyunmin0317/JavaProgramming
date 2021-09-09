package chap02.practice02;

public class MP3Manager {
	public static void main(String[] args) {
		IDBLoader dbLoader = new DBLoader();
		dbLoader.loadMP3s();
	}
}
