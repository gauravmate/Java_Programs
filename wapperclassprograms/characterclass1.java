package wapperclassprograms;

public class characterclass1 {
    public static void main(String[] args) {
        String s1 = "Gaurav Mate123";
        char[] arr = s1.toCharArray();
        int noc = 0, nos = 0, nod = 0;
        for (char c : arr) {
            if (Character.isLowerCase(c)) {
                nos++;
            } else if (Character.isUpperCase(c)) {
                noc++;
            } else if (Character.isDigit(c)) {
                nod++;

            }

        }
        System.out.println("number of capital latter " + noc);
        System.out.println("number of small latter " + nos);
        System.out.println("number of digits " + nod);
    }

}
