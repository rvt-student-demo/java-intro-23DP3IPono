package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Account matthewsAccount = new Account("Matthew's account", 1000.00);
        Account myAccount = new Account("My account", 0.00);

        System.out.println("Initial state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    

        matthewsAccount.withdraw(100);
        System.out.println("The balance of Matthew's account is now: " + matthewsAccount.balance());

        myAccount.deposit(100);
        System.out.println("The balance of My account is now: " + myAccount.balance());

    
        System.out.println("End state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    
    }

}