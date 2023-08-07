import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    Calculator calculator = new Calculator();

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

     int score ;




    public  void game(){
        System.out.println("Welcome to MathQuiz");

        for (int i = 1; i <=6; i++ ){

            int firstNumber = random.nextInt(100)+1;
            int secondNumber = random.nextInt(100)+1;
            int correctNumber =calculator.Add(firstNumber,secondNumber);
            System.out.print("Answer for  question : "  + firstNumber + " + " + secondNumber + " :  " );
            int userAnswer = scanner.nextInt();
            System.out.println("Your Answer : "  + userAnswer );
            System.out.println("Correct Answer : " + correctNumber);
            if (userAnswer == correctNumber ){

                score += 5;
                System.out.println("Your points : + 5 point");
            }else {
                score -=5;
                System.out.println("You points : - 5 point");
            }


        }
        System.out.println("Game Over your points : " + score );

    }


}

