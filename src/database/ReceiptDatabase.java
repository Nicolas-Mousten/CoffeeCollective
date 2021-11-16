package database;

import products.CustomerBasket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptDatabase {
    public ArrayList<CustomerBasket> memoryList = new ArrayList<>();

    public static void addToDatabase(CustomerBasket currentCustomer){
        File file = new File("Resources/Receipts.csv");
        try{
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] lineArray = line.split(";");
            CustomerBasket temp = new CustomerBasket();
            temp.setAmericansOrdered(lineArray[0]);
        }



        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
