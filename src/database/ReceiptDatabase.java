package database;


import products.CustomerBasket;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReceiptDatabase {
    public static ArrayList<CustomerBasket> memoryList = new ArrayList<>();

    public static void addToDatabase(CustomerBasket currentCustomer) {
        try(FileWriter fw = new FileWriter("Resources/Receipts.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)){
            String inputString = currentCustomer.toString();
            out.println(inputString);
        }catch(IOException e){
            System.out.println("Can't write to this file");
        }

    }
}
