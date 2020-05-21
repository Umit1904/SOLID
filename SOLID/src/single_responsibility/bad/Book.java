package single_responsibility.bad;
import java.util.*;
public class Book {
    private String name;
    private String authorName;
    private int totalPageCount;
    int currentPageCount = 0;
    public Book(){}
    public Book(String name, String authorName, int numOfPages){
        this.name = name;
        this.authorName = authorName;
        this.totalPageCount = numOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public void read(int page){
        this.currentPageCount = (this.currentPageCount + page <= this.totalPageCount)
                ? this.currentPageCount + page : this.totalPageCount;
    }
    public void read(){
        this.currentPageCount = (this.currentPageCount + 1 <= this.totalPageCount)
                ? this.currentPageCount + 1 : this.totalPageCount;
    }
    public void printBookInformation(){
        System.out.println(this.name + " of " + this.authorName + " and read "
                + this.currentPageCount + " out of " + this.totalPageCount );
    }
}