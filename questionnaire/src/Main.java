import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
        int number1 ;
        int number2 ;
        int sum ;
        int userAnswer ;
            do {
                number1 = random.nextInt(100) + 1;
                number2 = random.nextInt(100) + 1;
                sum = number1 + number2;
                System.out.println( number1 + "+" + number2 );
                System.out.println("Type Answer : ");
                userAnswer = scanner.nextInt();
                System.out.println("Your Answer : " + userAnswer);
                System.out.println("Correct Answer : " + sum);


            }while (userAnswer != sum);

            System.out.println("Cheers! questionnaire complete you WIN!!!!");


            }




    }
