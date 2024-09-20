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

        
        
        System.out.println("Give points [0-100]: ");
        int x = Integer.valueOf(scanner.nextLine());
        if (x < 0) {
            System.out.println("Grade: impossible!");
        } else if (x >= 0 && x <= 49) {
            System.out.println("Grade: failed");
        } else if (x >= 50 && x <= 59) {
            System.out.println("Grade: 1");
        } else if (x >= 60 && x <= 69) {
            System.out.println("Grade: 2");
        } else if (x >= 70 && x <= 79) {
            System.out.println("Grade: 3");
        } else if (x >= 80 && x <= 89) {
            System.out.println("Grade: 4");
        } else if (x >= 90 && x <= 99) {
            System.out.println("Grade: 5");
        } else if (x >= 100) {
            System.out.println("Grade: incredible!");
        }



    


        
    }

}
