import java.util.Random;
import java.util.Scanner;




class MathQuiz {
    public void game() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        System.out.println("Welcome to MathQuiz");

        for (int i = 0; i < 6; i++) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
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

            System.out.println("Answer for question : " + num1 + " " + operator + " " + num2 );
            int userAnswer = scanner.nextInt();
            System.out.println("Your Answer :" + userAnswer);
            System.out.println("Correct Answer :" + correctAnswer);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! +5 points");
                score += 5;
            } else {
                System.out.println("Incorrect! -5 points");
                score -= 5;
            }
        }

        System.out.println("Congratulations you answered all question your score : " + score);
    }
}