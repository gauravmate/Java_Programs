package Function_Programs;

public class mathfuction {
    public static void main(String[] args) {
        double theta = 120.0;
        System.out.println(theta + "degree is" + Math.toRadians(theta) + "radius");
        theta = 1.312;
        System.out.println(theta + "radius is" + Math.toDegrees(theta) + "degrees");
        double x = 45;
        double y = 180;
        System.out.println("" + Math.sinh(x));
        System.out.println("" + Math.sinh(y));
        int g = 567876756;
        int f = 34567898;
        System.out.println("math abs" + Math.abs(g));
        System.out.println("math abs" + Math.abs(f));

        System.out.println("Logirithm Of X" + Math.log(x));
        System.out.println("Logirithm Of Y" + Math.log(y));

        System.out.println("Square Root Of X " + Math.sqrt(x));
        System.out.println("Square Root Of  X" + Math.sqrt(y));

        System.out.println("Power Of X And Y " + Math.pow(x, y));

        System.out.println("Log 10 Of X" + Math.log10(x));
        System.out.println("Log 10 Of Y" + Math.log10(y));

        System.out.println("Sin Of X" + Math.sin(x));
        System.out.println("Sin Of Y" + Math.sin(y));

        System.out.println("cos Of X" + Math.cos(x));
        System.out.println("cos Of Y" + Math.cos(y));

        System.out.println("tan Of X" + Math.tan(x));
        System.out.println("tan Of Y" + Math.tan(y));

        System.out.println("expm1 Of X" + Math.expm1(x));
        System.out.println("expm1 Of Y" + Math.expm1(y));

        System.out.println("random is :"+Math.random());

    }
}
