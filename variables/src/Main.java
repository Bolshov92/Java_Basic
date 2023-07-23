import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Сужение
        int intVal = 10;
        byte byteVal =(byte)intVal;

        float floatVal =1350.5f;
        double doubleVal =(double)floatVal;



        System.out.println(byteVal);
        System.out.println(doubleVal);
        System.out.println();
        System.out.println();

        //расширение
        byte byteVal2 = 5;
        int intVal2 = byteVal2;

        float floatVal2 = 24565.5f;
        double doubleVal2 = floatVal2;

        System.out.println(intVal2);
        System.out.println(doubleVal2);
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Иия Пользователя");
        String str1 = scanner.next();
        System.out.println("Привет - "  + str1);








    }
}