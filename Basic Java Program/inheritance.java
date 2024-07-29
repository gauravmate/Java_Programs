class a{
    void show(){
    System.out.println("in a");    
    }

}
class ba extends a{
    void disp(){
        System.out.println("in b");
    }
}
class inheritance{
    public static void main(String[] args) {
     ba ob=new ba();
     ob.show();
     ob.disp();   
    }
}

