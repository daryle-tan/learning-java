import java.util.Scanner;

public class ChallengeOne {

    public static void main(String args[]) {
        String question = "What is control flow?";
        String choiceOne = "A";
        String choiceTwo = "B";
        String choiceThree = "C";

        String correctAnswer = choiceOne;
        
        System.out.println(question);
        System.out.println("Choose from one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(correctAnswer.equals(input.toUpperCase())) {
            System.out.println("Congrats that is the correct answer!");
        } else {
            System.out.println("Sorry that is the incorrect choice. The correct answer is " + correctAnswer);
        }
    }
}
