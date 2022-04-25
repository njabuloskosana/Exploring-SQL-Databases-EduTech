import java.util.Locale;
import java.util.Scanner;
public class ATM {

    public static void main(String[] args) throws Exception {

        SqlDatabaseQueries atm = new SqlDatabaseQueries();
        boolean response=false;
        
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.US);
            int x;
            atm.showMenu();
            x = scan.nextInt();

            switch (x) {
            case 1:
                response=atm.createCard();
                break;

            case 2:
                response=atm.getBalance();
                scan.close();
                break;

            case 3:
                response=atm.deposit();
                scan.close();
                break;

            case 4:
                response=atm.withDraw();
                scan.close();
                break;

            case 5:
                response=atm.printStatement();
                scan.close();
                break;
            case -1:
                scan.close();
                break;
            
            default:
                System.out.println("Wrong choice");
                break;
            }


        
    }
}

