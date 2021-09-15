package exercises.week02;

import java.util.List;

public class BookManager {
    private List<Book> books = null;
    private BookDataLoader loader;
    private BookDataViewer viewer;

    public BookManager(BookDataLoader loader, BookDataViewer viewer) {
        this.loader = loader;
        this.viewer = viewer;
    }

    // load
    public void load() {
        books = loader.load();
    }

    // show
    public void show() {
        viewer.show(books);
    }
}