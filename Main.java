public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Dee", "Tee", 2022, 3.08, "Business Management");
        StudentProfile studentB = new StudentProfile("Homer", "Simpson", 2023, 3.6, "Computer Sciences");
        
        studentA.incrementExpectedGraduationYear();
        System.out.println("This is " + studentA.firstName + " " + studentA.lastName + " graduation year: " + studentA.expectedYearToGraduate);
        // Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        // Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        // double triangleAArea = triangleA.findArea();
        // System.out.println(triangleAArea);

        // double triangleBArea = triangleB.findArea();
        // System.out.println(triangleBArea);

        // System.out.println(triangleA.sideLenThree);
        // System.out.println(triangleB.base);

        // System.out.println(Triangle.numOfSides);
    }
}
