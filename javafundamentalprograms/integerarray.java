package PBLWipro.javafundamentalprograms;

public class integerarray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4};
        int sum=0;
        for(int i:arr)
        {
            sum+=i;

        }
        System.out.println(sum);
        float avg=(float)sum/(float)arr.length;
        System.out.println(avg);
    }
}
