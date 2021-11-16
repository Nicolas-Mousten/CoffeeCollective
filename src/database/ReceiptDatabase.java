package database;

import products.CustomerBasket;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
            ArrayList<Object> tempObject = new ArrayList<Object>(Arrays.asList(lineArray));


        }



        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
