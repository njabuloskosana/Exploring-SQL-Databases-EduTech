import java.util.Scanner;
import javax.swing.*;
import java.math.*;
import java.sql.*;
import java.sql.PreparedStatement;

public class SqlDatabaseQueries {

    /**
     * Note : You are required to add your own arguments in all the functions so that 
     * You have all the data required to store information into the database
     */

    /**
     * This function will print out a numbered options the user can select 
     * to perform a transaction with the ATM
     */
    public void showMenu()
    { 
        System.out.println("Welcome to I-LAB Bank");
         Scanner scan = new Scanner(System.in); 
         System.out.println("1. Create Card");
         System.out.println("2. Get Balance");
         System.out.println("3. Deposit ");
         System.out.println("4. Withdraw");
         System.out.println("5. Print Statement");


    }

    /**
     * This function will create a new card for a client
     * This function will also add a new client into the database
     * If the user has already been added print out user already has a profile to the terminal
     * Add missing parameters
     * @return
     */
    public boolean createCard()
    {
        Scanner scan = new Scanner(System.in); 
        //prompted to enter informtaion regarding individual.
        System.out.println("----To create card, please enter your details----");
        System.out.print("Enter ID Number: ");
        int id = scan.nextInt();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter first name: ");
        String fname = scan.nextLine(); 
        System.out.print("Enter last name: ");
        String lname = scan.nextLine();  
        System.out.print("Enter gender: ");
        String gender = scan.nextLine();  
        System.out.print("Enter Contact Address: ");
        String address = scan.nextLine();

        
        String details = ("Name: "+fname+" "+lname);
        String details2 = ("Gender: "+gender);
        String details3 = ("Contact address: "+address);

        System.out.println("Please confirm the following captured details are entered correctly");
    
        System.out.println("0 = yes;  1 = no;  2 = cancel");
        int option = scan.nextInt();
        do {
            if(option == 0)
            {
                System.out.println("Your card has been successfully created!");
                System.out.println(details);
                System.out.println(details2);
                System.out.println(details3);
                break;

            }
            else if( option == 1)
            {
                System.out.println("You will be taken back to fill out details again");
                break;
                // **!!need to figure out how to go back to the beginning of the program!!!!!!   
            }
            else
            {
                System.out.println("You have cancelled. You will be taken to the main menue shortly");
                break;
            }
        }
        while(option <=2);
        

        return false;
    }
    


    /**
     * This function will add a new client into the database
     * This function will be called by create card
     * Add missing parameters
     * @return
     */
    public boolean addClient()
    {
        
        return false;
    }
    

    /**
     * This returns the balance of the client
     * The function will also update the transaction records and reports after a balance inquiry transaction is performed
     * Add missing parameters
     * @return
     */
    public boolean getBalance() {
        int balance = 10000;
        System.out.println("Your balance is: " + balance);
        return false;
    }


    /**
     * This function deposits money into the users savings account
     * The function will also update the transaction records and reports after a savings transaction is performed
     * Add missing parameters
     * @return
     */
    public boolean deposit()
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter deposit amount : ");
        int deposit = scan.nextInt();
        

        return false;
    }

    /**
     * This function withdraws money from the users savings account
     * The function will also update the transaction records and reports after a withdraw transaction is performed
     * Add missing parameters
     * @return
     */
    public boolean withDraw()
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter withdraw amount : ");
        int withdraw = scan.nextInt();
        return false;
    }

   
    /**
     * This fuction will print out all the reported transactions of a client
     * And the balance or ammount associated with that specific transaction
     * Add missing parameters
     * @return
     */
    public boolean printStatement(){

        return false;
    }

    
}

