class studentid{
    private String fname;
    private String lname;
    private int year;
    private String brance;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrance() {
        return brance;
    }
    public void setBrance(String brance) {
        this.brance = brance;
    }
}
public class seter {
 public static void main(String[] args) {
  studentid st1=new studentid(); 
  st1.setFname("abc");
  st1.setLname("xyz");
  st1.setYear(2);
  st1.setBrance("IT");
 }   
}
