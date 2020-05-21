package single_responsibility.good;

import single_responsibility.bad.Book;

public class Bookmark {
    private int curPageCount;
    private Book book;

    public int getCurPageCount() {
        return curPageCount;
    }

    public void setCurPageCount(int curPageCount) {
        this.curPageCount = curPageCount;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Bookmark(Book book){
        this.book = book;
        this.curPageCount = 0;
    }
    public void printBookInformation(){
        System.out.println(book.getName() + " " + book.getAuthorName()
                + ", and you read " + this.curPageCount +" of "+  book.getTotalPageCount());
    }
}