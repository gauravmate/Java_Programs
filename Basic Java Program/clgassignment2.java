import java.util.Scanner;

class student5 {
  int roll_no;
  String name;
  float percetage;

  student5(int roll_no, String name, float percetage) {
    this.roll_no = roll_no;
    this.name = name;
    this.percetage = percetage;
  }

}

public class clgassignment2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    student5 stu[] = new student5[5];
    int max = 0, i;
    for (i = 0; i < 2; i++) {
      System.out.println("roll_no");
      int roll_no = sc.nextInt();
      System.out.println("name");
      String name = sc.next();
      System.out.println("percetage");
      float percetage = sc.nextFloat();
    }
    stu[i] = new student5(sc.nextInt(), sc.next(), sc.nextFloat());
    if (stu[max].percetage < stu[i].percetage) {
      max = i;
    }
    System.out.println("top scorer is" + stu[max].name);

  }
}
