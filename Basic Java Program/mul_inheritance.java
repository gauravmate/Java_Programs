class stud{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
class mark1 extends stud{
    private int m1,m2,m3,m4,m5;

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public int getM4() {
        return m4;
    }

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public int getM5() { 
        return m5;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }

}
class result extends mark1{
    void calculate(){
        int total=(getM1()+getM2()+getM3()+getM4()+getM5());
        System.out.println("total is ="+total);
        float avg=(getM1()+getM2()+getM3()+getM4()+getM5())/5;
        System.out.println("Average is ="+avg);
    }
}

public class mul_inheritance {
public static void main(String[] args) {
   result ob1=new result();
   ob1.setId(87);
   ob1.setName("Gaurav");
   ob1.setM1(89);
   ob1.setM2(79);
   ob1.setM3(80);
   ob1.setM4(99);
   ob1.setM5(78);

   System.out.println(ob1.getId());
   System.out.println(ob1.getName());
   System.out.println(ob1.getM1());
   System.out.println(ob1.getM2());
   System.out.println(ob1.getM3());
   System.out.println(ob1.getM4());
   System.out.println(ob1.getM5());
   ob1.calculate();
}    
}
