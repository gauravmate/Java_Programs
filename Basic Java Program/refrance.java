class demov{
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
public class refrance {
    public static void main(String[] args) {
        demov obj1=new demov();
        obj1.setij(10,20);
        demov obj2=new demov();
        obj2=obj1;
        obj2.setij(80,90);
        obj1.add();
        obj2.add();
        
    }
    
}
