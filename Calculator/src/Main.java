import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();
        int number1 = random.nextInt(100)+1;
        int number2 = random.nextInt(100)+1;
        calculator.getAdd(number1, number2);
        int Sum = calculator.getAdd(number1, number2);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(Sum);

        System.out.println();
        System.out.println();

        Random random2 = new Random();
        int number3 = random2.nextInt(100)+1;
        int number4 = random2.nextInt(100)+1;
        int subtract = calculator.getSubtract(number3, number4);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(subtract);
        System.out.println();
        System.out.println();

        Random random3 = new Random();
        int number5 = random3.nextInt(100)+1;
        int number6 = random3.nextInt(100)+1;
        int multiply = calculator.getMultiply(number5, number6);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(multiply);
        System.out.println();
        System.out.println();


        Random random4 = new Random();
        int number7 = random4.nextInt(100)+1;
        int number8 = random4.nextInt(100)+1;
        int divide = calculator.getDivide(number7, number8);

        System.out.println(number7);
        System.out.println(number8);
        System.out.println(divide);







    }
}