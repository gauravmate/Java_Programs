package PBLWipro.javafundamentalprograms;

import java.util.Arrays;
import java.util.Collections;

public class maxmin {
    public static void main(String[] args) {
        Integer[] arr={1,5,7,89};
        int min=Collections.min(Arrays.asList(arr));
        int max=Collections.max(Arrays.asList(arr));
        System.out.println("min value= "+min);
        System.out.println("max value= "+max);
    }
}
