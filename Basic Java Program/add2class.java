class demoa{
    int i;
    int j;
    void setij(int x,int y){
    i=x;
    j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class add2class {
    public static void main(String[] args) {
        demoa obj1=new demoa();
        obj1.setij(10,20);
        demoa obj2=new demoa();
        obj2.setij(80,90);
        obj1.add();
        obj2.add();
        
    }
    
}
