class b{
    b(){
        System.out.println("in b");
    }
}
class c extends b{
    c(){
        System.out.println("int c");
    }
}
class d extends c{
    d(){
        System.out.println("in d");
    }
}

public class constructorinheritance {
 public static void main(String[] args) {
  d ob=new d();  
 }   
}
