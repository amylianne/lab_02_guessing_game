import java.util.Scanner;
public class WhatToWear {
    public static void main(String[] args) {

//        String weather = "sunny";
//        int temp = 20;
// prompt user for input on weather
        System.out.println("what is the weather like today?");
        // collect user input weather
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();

        //input for temperature
        System.out.println("what is the temperature like today?");
        // collect user input temp
        Scanner reader2 = new Scanner(System.in);
        int temp = reader2.nextInt();

        //weather="rainy" && temp < 15) {
        if (weather.equals("rainy") && temp<20){
            System.out.println("wear a waterproof winter coat");
        }
        else if (weather.equals("rainy") && temp>20){
            System.out.println("wear a waterproof light coat");
        }

        else if (weather.equals("sunny") && temp<20){
            System.out.println("Wear a light jacket");
        }

        else if (weather.equals("sunny") && temp>20){
            System.out.println("No need for a coat");
        }
        else {
            System.out.println("Hmmmm not sure");
        }

    }
}
