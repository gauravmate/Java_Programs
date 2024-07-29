import java.util.Scanner;

 abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

class circle extends Shape {
    circle(double d1) {
        super(d1, 0);
    }

     double area() {
        return 3.14 * dim1 * dim1;
    }
}

class rectangle extends Shape {
    rectangle(double d1, double d2) {
        super(d1, d2);
    }

     double area() {
        return dim1 * dim2;
    }
}

public class clgass {
    public static void main(String args[]){
        Shape ref;
        ref= new circle (5);
        System.out.println("Arean of circle="+ref.area());
        ref=new rectangle(2,9);
        System.out.println("Arean of rectangle ="+ref.area());

        }
}