package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String longname = "";
        int years = 0;
        int count = 0;

        while (true) {
            System.out.println();
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0].trim();
            int year = Integer.parseInt(parts[1].trim());

            if (name.length() > longname.length()) {
                longname = name;
            }

            years += year;
            count++;

        }

        System.out.println("Longest name: " + longname);
        System.out.println("Average of the birth years: " + (double) years/count);
        
    }

}