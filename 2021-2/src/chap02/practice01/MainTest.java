package chap02.practice01;

public class MainTest {
    public static void main(String[] args) {
        BookManager manager = new BookManager(new BookDataLoaderFromFile(), new BookDataViewer());
        manager.load();
        manager.show();
    }
}