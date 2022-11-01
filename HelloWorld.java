import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        // System.out.println("Hello World! It's me Daryle! and I love TACOS!");
        int studentAge = 15;
        double studentGPA = 3.45;
        
        Boolean hasPerfectAttendance = true;
        
        String studentName = "Kayla Hammon";
        char studentFirstInitial = studentName.charAt(0);
        char studentLastInitial = studentName.charAt(6);
        

        System.out.println(studentName + " has a GPA of " + studentGPA );
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentName + " now has a GPA of " + studentGPA);
    }
}