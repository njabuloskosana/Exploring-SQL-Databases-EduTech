import java.util.Locale;
import java.util.Scanner;
import java.sql.*;
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
                
            default:
                System.out.println("Wrong choice");
                break;
            }
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2","root","45?:.4coD$");
                Statement stnt=con.createStatement();
                ResultSet rs=stnt.executeQuery("insert * FROM client");
                while(rs.next())
                {
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
                    
                }
                con.close();

            }
            catch(Exception e)
            {  
                System.out.print(e);
            }
            
        }
}

