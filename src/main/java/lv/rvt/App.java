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

        
        
        // System.out.println("Give points [0-100]: ");
        // int x = Integer.valueOf(scanner.nextLine());
        // if (x < 0) {
        //     System.out.println("Grade: impossible!");
        // } else if (x >= 0 && x <= 49) {
        //     System.out.println("Grade: failed");
        // } else if (x >= 50 && x <= 59) {
        //     System.out.println("Grade: 1");
        // } else if (x >= 60 && x <= 69) {
        //     System.out.println("Grade: 2");
        // } else if (x >= 70 && x <= 79) {
        //     System.out.println("Grade: 3");
        // } else if (x >= 80 && x <= 89) {
        //     System.out.println("Grade: 4");
        // } else if (x >= 90 && x <= 99) {
        //     System.out.println("Grade: 5");
        // } else if (x >= 100) {
        //     System.out.println("Grade: incredible!");
        // }

        // System.out.println("Value of the gift?");
        // int gift = Integer.valueOf(scanner.nextLine());
        // if (gift < 5000) {
        //     System.out.println("No tax!");
        // }
        // else if (gift >= 5000 && gift <= 25000) {
        //     System.out.println("Tax: " + (100+(gift-5000)*0.08));
        // }
        // else if (gift > 25000 && gift <= 55000) {
        //     System.out.println("Tax: " + (1700+(gift-25000)*0.1));
        // }
        // else if (gift > 55000 && gift <= 200000) {
        //     System.out.println("Tax: " + (4700+(gift-55000)*0.12));
        // }
        // else if (gift > 200000 && gift <= 1000000) {
        //     System.out.println("Tax: " + (22100+(gift-200000)*0.15));
        // }
        // else {
        //     System.out.println("Tax: " + (142100+(gift-1000000)*0.17));
        // }



        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);



    


        
    }

}
