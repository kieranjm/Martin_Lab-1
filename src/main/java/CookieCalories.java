
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
public class CookieCalories {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int oreo = 75;
        int oreosEaten = 0;
        int totalCalories = 0;
        
        System.out.println("How many oreos did you eat?");
        oreosEaten = keyboard.nextInt();
        totalCalories = oreosEaten * oreo;
        
        System.out.println("You consumed " + totalCalories + "calories");
    }
}
