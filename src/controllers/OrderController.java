package controllers;

import products.*;
import ui.OrderTakingMenu;
import ui.StatisticsMenu;

public class OrderController {
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
                    break;
                case 2:
                    currentCustomer.addToEspresso(new Espresso());
                    break;
                case 3:
                    currentCustomer.addToTea(new Tea());
                    break;
                case 4:
                    currentCustomer.addToBaguette(new Baguette());
                    break;
                case 5:
                    currentCustomer.addToCroissant(new Croissant());
                    break;
                case 6:
                    statisticsMenu.printStatisticsChoice();
                    statisticsMenu.receiveUserInput();
                    break;
            }
        }while(userInput != 9);
    }
}
