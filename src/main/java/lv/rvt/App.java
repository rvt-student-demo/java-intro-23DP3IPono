package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Account artosAccount = new Account("Arto's account", 100.00);
    

    System.out.println("Initial state");
    System.out.println(artosAccount);
    

    artosAccount.deposit(20);
    System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
    
    System.out.println("End state");
    System.out.println(artosAccount);
    
    }

}