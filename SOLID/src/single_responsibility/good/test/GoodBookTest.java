package single_responsibility.good.test;


import org.junit.Test;
import single_responsibility.bad.Book;
import single_responsibility.good.BookReader;

import static org.junit.Assert.assertEquals;


public class GoodBookTest {
    @Test
    public void TestReadSeveralPages(){
        Book book1 = new Book("Head First Java", "Bert Bates", 300);

        BookReader bookReader = new BookReader();
        bookReader.setCurrentBook(book1);
        bookReader.read(150);
        assertEquals(150, bookReader.getCurrentBookmark().getCurPageCount());
    }
    @Test
    public void TestReadMoreThanTotalPages(){
        Book book1 = new Book("Head First Java", "Bert Bates", 300);
        BookReader bookReader = new BookReader();
        bookReader.setCurrentBook(book1);
        bookReader.read(305);
        assertEquals(300, bookReader.getCurrentBookmark().getCurPageCount());
    }
    @Test
    public void TestBookmarkActuality(){
        Book book1 = new Book("Head First Java", "Bert Bates", 300);
        Book book2 = new Book("Java Phylosophy", "Ekkel", 280);
        BookReader bookReader = new BookReader();
        bookReader.setCurrentBook(book1);
        bookReader.read(110);
        bookReader.setCurrentBook(book2);
        bookReader.read(150);
        bookReader.setCurrentBook(book1);
        assertEquals(110, bookReader.getCurrentBookmark().getCurPageCount());
    }
}