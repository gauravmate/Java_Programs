public class bookid {
    private int bookid;
    private String title;
    private String author;
    private String category;
    private Float price;
  public bookid(int bookid,String title,String author,String category,Float price){
    super();
    this.bookid =bookid;
    this.title =title;
    this.author =author;
    this.category =category;
    this.price =price;

  }
public int getBookid() {
    return bookid;
}
public String getTitle() {
    return title;
}
public String getAuthor() {
    return author;
}
public String getCategory() {
    return category;
}
public Float getPrice() {
    return price;
}
  


}
