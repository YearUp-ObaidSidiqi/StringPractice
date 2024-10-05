package com.pluralsight;

public class Split {
    public static void main(String[] args) {


        String input = "Dallas|Ft. Worth|Austin|New York|Boston";

        String[] cities = input.split("\\|");

        System.out.println(cities[0]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        //      String[] cities = input.split(Pattern.quote("|"));





    }
}
