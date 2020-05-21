package single_responsibility.good;

public class Book {
    String name;
    String authorName;
    int totalPageCount;
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
}