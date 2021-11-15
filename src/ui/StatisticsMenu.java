package ui;

import statistics.CoffeeTypeCounter;

import java.util.Scanner;

public class StatisticsMenu {
    private Scanner sc = new Scanner(System.in);

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void printStatisticsChoice(){
        System.out.println("1. Coffee statistics");
        System.out.println("2. Food statistics");
        System.out.println("3. All statistics");
    }
    public static void choice(int userInput){
        if(userInput == 1){
            displayCoffeeStatistics();
        }else if(userInput == 2){
            displayFoodStatistics();
        }else if(userInput == 3){
            displayAllStatistics();
        }
    }
    public static void displayCoffeeStatistics(){
        System.out.println(CoffeeTypeCounter.howManyCoffeesSold());
    }

    public static void displayFoodStatistics(){
        System.out.println(CoffeeTypeCounter.howManyFoodsSold());
    }

    public static void displayAllStatistics(){
        System.out.println(CoffeeTypeCounter.howManySoldInTotal());
    }
}
