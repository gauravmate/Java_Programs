import java.util.Scanner;

class stud {
    int id;
    String name, stream;
    Scanner sc = new Scanner(System.in);

    stud() {
        System.out.println("enter student id");
        id = sc.nextInt();
        System.out.println("enter a name");
        name = sc.next();
    }
}

class graduationa extends stud {
    graduationa() {
        System.out.println("enter student stream");
        stream = sc.next();
    }

    void display() {
        System.out.println("student id=" + id);
        System.out.println("student name=" + name);
        System.out.println("student stream=" + stream);
    }
}

public class clgassignments {
    public static void main(String[] args) {
        graduationa ob1 = new graduationa();
        ob1.display();
    }
}
