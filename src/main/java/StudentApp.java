import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //prompt user for details




        Student firstStudent=new Student();
        firstStudent.setName("Alvin");
        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        System.out.println("Please enter your email");
        String studentEmail = sc.nextLine();
        System.out.println("Please Enter your course");
        String studentCourse = sc.nextLine();



        Student firststudent = new Student();
         firststudent.setName(studentName);
        firststudent.setEmail(studentEmail);
        firststudent.setCourse(studentCourse);


        System.out.println(firststudent.toString());

    }
}
