public class TextMessage {

    public String text = "";



    public TextMessage(){

    }

    public TextMessage(String newText){
        text = newText;
        String replaceText = text.replaceAll("fuck","fk");
        System.out.println(replaceText);






    }



    }





