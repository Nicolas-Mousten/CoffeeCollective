package controllers;

import database.ReceiptDatabase;
import products.*;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;
import statistics.CoffeeTypeCounter;

public class OrderController {
    // should mabye be changed later
    public static void MainMenu(){
        OrderTakingMenu orderMenu = new OrderTakingMenu();
        StatisticsMenu statisticsMenu = new StatisticsMenu();

        orderMenu.welcomeUser();
        int userInput;
        CustomerBasket currentCustomer = new CustomerBasket();
        do{
            orderMenu.printOptions();
            userInput = orderMenu.receiveUserInput();
            switch(userInput){
                case 1:
                    currentCustomer.addToAmericano(new Americano());
                    CoffeeTypeCounter.oneAmericanoSold();
                    break;
                case 2:
                    currentCustomer.addToEspresso(new Espresso());
                    CoffeeTypeCounter.oneEspressoSold();
                    break;
                case 3:
                    currentCustomer.addToTea(new Tea());
                    CoffeeTypeCounter.oneTeaSold();
                    break;
                case 4:
                    currentCustomer.addToCroissant(new Croissant());
                    CoffeeTypeCounter.oneCroissantSold();
                    break;
                case 5:
                    currentCustomer.addToBaguette(new Baguette());
                    CoffeeTypeCounter.oneBaguetteSold();
                    break;
                case 6:
                    int ChoiceInput = 0;
                    do {
                        statisticsMenu.printStatisticsChoice();
                        ChoiceInput = statisticsMenu.receiveUserInput();
                        StatisticsMenu.choice(ChoiceInput);
                    }while(ChoiceInput != 9);
                    break;
            }
        }while(userInput != 9);
        System.out.println(currentCustomer);
        ReceiptDatabase.addToDatabase(currentCustomer);
    }
}
