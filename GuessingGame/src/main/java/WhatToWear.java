public class WhatToWear {
    public static void main(String[] args) {
        String weather = "sunny";
        int temp = 20;

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


    }
}
