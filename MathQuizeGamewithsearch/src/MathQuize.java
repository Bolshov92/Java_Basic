import java.util.Random;
import java.util.Scanner;

public class MathQuize {


    Calculator calculator = new Calculator();

    public void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Math Quiz Game!");
        int gamers = 2;
        int[][] scores = new int[gamers][1];
        String[] playerNames = new String[gamers];

        for (int player = 0; player < gamers; player++) {
            scores[player][0] = 0;

            System.out.print("Enter the name of Player " + (player + 1) + ": ");
            playerNames[player] = scanner.next();

            System.out.println("Player " + playerNames[player]);
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

                System.out.println("Answer for question: " + num1 + " " + operator + " " + num2);
                int userAnswer = scanner.nextInt();
                System.out.println("Yor Answer : " + userAnswer);
                System.out.println("Correct Answer : " + correctAnswer);

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct Answer : You get +5 points.");
                    scores[player][0] += 5;
                } else {
                    System.out.println("Incorrect Answer : You lose 5 points.");
                    scores[player][0] -= 5;
                }
            }

            System.out.println("You answered all the questions.");
            System.out.println();
            System.out.println();

        }

        for (int player1 = 0; player1 < gamers - 1; player1++) {
            for (int player2 = 0; player2 < gamers - player1 - 1; player2++) {
                if (scores[player2][0] < scores[player2 + 1][0]) {
                    int tempScore = scores[player2][0];
                    scores[player2][0] = scores[player2 + 1][0];
                    scores[player2 + 1][0] = tempScore;

                    String tempName = playerNames[player2];
                    playerNames[player2] = playerNames[player2 + 1];
                    playerNames[player2 + 1] = tempName;
                }
            }
        }

        System.out.println("Final scores : ");
        for (int player = 0; player < gamers; player++) {
            System.out.println(playerNames[player] + ": " + scores[player][0]);
        }

        System.out.println(playerNames[0] + " wins with a score : " + scores[0][0] + " points");
    }
}