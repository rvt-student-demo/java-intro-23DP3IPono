package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // String text = "contains text";
        // int wholeNumber = 123;
        // double floatingPoint = 3.141592653;
        // boolean trueOrFalse = true;
        
        // System.out.println("Text variable: " + text);
        // System.out.println("Integer variable: " + wholeNumber);
        // System.out.println("Floating-point variable: " + floatingPoint);
        // System.out.println("Boolean: " + trueOrFalse); 



        Scanner scanner = new Scanner(System.in);

        // System.out.println("Write text and press enter ");
        // String text = scanner.nextLine();
        // System.out.println("You wrote " + text);

        // System.out.println("Give the first number:");
        // int x = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the second number:");
        // int y = Integer.valueOf(scanner.nextLine());

        // System.out.println(x + " + " + y + " = " + (x+y));
        // System.out.println(x + " - " + y + " = " + (x-y));
        // System.out.println(x + " * " + y + " = " + (x*y));
        // System.out.println(x + " un " + y + " vidējais skaitlis " + ((double)x+y)/2);

        
        
        System.out.println("Give speed: ");
        int x = Integer.valueOf(scanner.nextLine());
        if (x > 120) {
            System.out.println("Speeding ticket!");
        }
    


        
    }

}
