package exercises.week02;

import java.util.List;

public class BookDataLoaderFromFile extends BookDataLoader {
    @Override
    public List<Book> load() {
        System.out.println("BookDataLoaderFromFile.load() called");
        return null;
    }
}