package chap02;

import java.util.List;

public class BookDataLoaderDB extends BookDataLoader {
    @Override
    public List<Book> load() {
        System.out.println("BookDataLoaderDB.load() called");
        return null;
    }
}