package wapperclassprograms;

public class converdoublefloat {
    public static void main(String[] args) {
        String s1 ="1.2";
        double x;
        x=Double.parseDouble(s1);
        System.out.println(x+x);

        String s2 ="1.2";
        double y;
        y=Float.parseFloat(s2);
        System.out.println(y*y);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);




    }
    
}
