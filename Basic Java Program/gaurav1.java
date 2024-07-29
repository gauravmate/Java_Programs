// import java.util.Scanner;
// abstract class Shape
// {
//   double dim1,dim2;
//   Shape(double d1,double d2)
//   {
//     dim1=d1;
//     dim2=d2;
//   }
//   abstract double area();
// }
// class circle extends Shape{
//     circle (double d1)
//     {
//         super (d1,0);
//     }
//     double area(){
//         return 3.14*dim1*dim1;
//     }
// }
// class rectangle extends Shape {
//     rectangle (double d1, double d2){
//         super(d1,d2);
//     }
//     double area(){
//         return dim1*dim2;
//     }
// }
// public class gaurav1{
//     public static void main(String args[]){
//         Shape s;
//         s= new circle (2);
//         System.out.println("Arean of circle="+s.area());
//         s=new rectangle(2,9);
//         System.out.println("area of rectangle="+s.area());
//     }
// }