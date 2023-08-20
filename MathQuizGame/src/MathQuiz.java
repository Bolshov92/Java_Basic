import java.util.Random;
import java.util.Scanner;

class MathQuiz {
    Calculator calculator = new Calculator();
    public  void game() {
       Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Game : ");
        int gamers = 2;
        int[][] scores = new int[gamers][1];

        for (int player = 0; player < gamers; player++) {
            scores[player][0] = 0;

            System.out.println("Player " + (player + 1));
            for (int i = 0; i < 6; i++) {
                int num1 = random.nextInt(20) + 1;
                int num2 = random.nextInt(20) + 1;
                int operation = random.nextInt(4);

                String operator = "";
                int correctAnswer = 0;

                switch (operation) {
                    case 0:
                        operator = "+";
                        correctAnswer = calculator.add(num1, num2);
                        break;
                    case 1:
                        operator = "-";
                        correctAnswer = calculator.subtract(num1, num2);
                        break;
                    case 2:
                        operator = "*";
                        correctAnswer = calculator.multiply(num1, num2);
                        break;
                    case 3:
                        operator = "/";
                        correctAnswer = calculator.divide(num1,num2);
                }

                System.out.println(  "Answer for question : " + num1  + operator  + num2 );
                int userAnswer = scanner.nextInt();
                System.out.println("Your Answer : " + userAnswer);
                System.out.println("Correct Answer : " + correctAnswer);

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct Answer you get  +5 points");
                    scores[player][0] += 5;
                } else {
                    System.out.println("Is not Correct Answer you lose 5 points");
                    scores[player][0] -= 5;
                }
            }

            System.out.println("You answered all the question");

        }

        System.out.println("Final scores:");
        for (int player = 0; player < gamers; player++) {
            System.out.println("Player " + (player + 1) + " : " + scores[player][0]);

        }

        }
    }
