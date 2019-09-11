
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjm61
 */
public class SalesTax {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        float county = (float) 0.02;
        float state = (float) 0.04;
        float totalTax = 0;
        float price = 0;
        
        System.out.println("Whats the price?");
        price = keyboard.nextInt();
        totalTax = state + county;
        price = (price*totalTax) + price;
        
        System.out.println("Your total is " + price);
    }
}
