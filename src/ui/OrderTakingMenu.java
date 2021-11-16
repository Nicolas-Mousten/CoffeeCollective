package ui;

import products.Americano;
import products.Baguette;
import products.Croissant;
import products.Tea;

import java.util.Scanner;

public class OrderTakingMenu {
    private Scanner sc = new Scanner(System.in);

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void welcomeUser(){
        System.out.println("Hello and welcome");
        System.out.println("What would you like to order?");
    }

    public void printOptions(){
        System.out.println("1. Americano    Price: "+ Americano.getPrice());
        System.out.println("2. Espresso     Price: "+ Baguette.getPrice());
        System.out.println("3. Tea          Price: "+ Tea.getPrice());
        System.out.println("4. Croissant    Price: "+ Croissant.getPrice());
        System.out.println("5. Baguette     Price: "+ Baguette.getPrice());
        System.out.println("6. Statistics");
        System.out.println("9. Place order");
    }
}
