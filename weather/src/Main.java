import Weather.Days;
import Weather.Type_of_Weather;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args){


        Type_of_Weather Type = new Type_of_Weather();
        Days whichDay = new Days();

        Type_of_Weather Type2 = new Type_of_Weather();
        Type2.typeOfWether3 = " 24 degrees (Sunny)";





        System.out.println(whichDay.dayOfTheWeek + Type.typeOfWether );
        System.out.println(whichDay.dayOfTheWeek2 + Type.typeOfWether2);
        System.out.println(whichDay.dayOfTheWeek3 + Type.typeOfWether3);
        System.out.println(whichDay.dayOfTheWeek4 + Type.typeOfWether4);
        System.out.println(whichDay.dayOfTheWeek5 + Type2.typeOfWether3);
        System.out.println(whichDay.dayOfTheWeek6 + Type.typeOfWether);
        System.out.println(whichDay.dayOfTheWeek7 + Type.typeOfWether3);



    }
}