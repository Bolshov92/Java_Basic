import org.w3c.dom.Text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        TextMessage message = new TextMessage("fuck");

        Scanner scanner = new Scanner(System.in);
         System.out.print("Type text 1 : ");
         String text = scanner.nextLine();

         System.out.print("Type text 2 : ");
         String text2 = scanner.nextLine();

         System.out.print("Type text 3 : ");
         String text3 = scanner.nextLine();

         String newMod = text.replace("fuck","f**K");
         String newMod2 = text2.replace("bullshit", "b****t");
         String newMod3 = text3.replace("beach", "b**h");


         System.out.println(newMod);
         System.out.println(newMod2);
         System.out.println(newMod3);










































    }
}