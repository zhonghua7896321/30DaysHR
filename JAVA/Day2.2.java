import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      double tip, tax;
      int price;
      tip = (M * T) / 100;
      tax = (M * X) / 100;
      price = (int)Math.round(tip + tax + M);
      System.out.println("The final price of the meal is $" + price + ".");
      
    }
}
