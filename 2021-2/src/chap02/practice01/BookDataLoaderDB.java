package chap02.practice01;

import java.util.List;

public class BookDataLoaderDB extends BookDataLoader {
    @Override
    public List<Book> load() {
        System.out.println("BookDataLoaderDB.load() called");
        return null;
    }
}