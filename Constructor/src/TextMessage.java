import java.util.Scanner;

public class TextMessage {

    public String text = "";




    public TextMessage(){

    }

    public TextMessage(String newText){
        text = newText;
        String replaceText = text.replaceAll("fuck","fk").replace("bullshit","b***t");
        System.out.println(replaceText);







    }


    }













