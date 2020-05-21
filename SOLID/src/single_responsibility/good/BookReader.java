package single_responsibility.good;
import single_responsibility.bad.Book;

import java.util.*;

public class BookReader{
    private Book currentBook;
    private Bookmark currentBookmark;
    private List<Bookmark> bookmarkList = new ArrayList<Bookmark>();

    public BookReader() {
    }

    public Book getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(Book currentBook) {//book1
        this.currentBook = currentBook;
        boolean found = false;
        for (Bookmark bookmark : bookmarkList){
            if (bookmark.getBook() == currentBook){
                found = true;
                this.currentBookmark = bookmark;
            }
        }
        if (!found){
            this.currentBookmark = new Bookmark(currentBook);
            this.bookmarkList.add(this.currentBookmark);
        }
    }

    public Bookmark getCurrentBookmark() {
        return currentBookmark;
    }

    public BookReader(Book book){
        setCurrentBook(book);
    }
    public void read(int page){
        if (currentBookmark.getCurPageCount() + page <= currentBook.getTotalPageCount()) {
            currentBookmark.setCurPageCount(currentBookmark.getCurPageCount() + page);
        }
        else {
            currentBookmark.setCurPageCount(currentBook.getTotalPageCount());
        }
    }

}