import java.util.*;

public class BankDemoTest {
    
    public static void main(String[] args) {
        CheckingAccount acc  = new CheckingAccount(0);
        boolean program_state = true;
        String choice;
        float ammount; 
        Scanner scan = new Scanner(System.in);
        while (program_state){
            System.out.println("(a) Deposit (b) withdraw (c) Check Balance ");
            System.out.print("Enter choice:");
            choice = scan.nextLine();
            switch (choice) {
                case "a":
                    System.out.print("Enter deposit ammount:");
                    ammount = Float.valueOf(scan.nextLine());
                    acc.deposit(ammount);
                break;
                case "b":
                    System.out.print("\nEnter withdraw ammount:");
                    ammount = Float.valueOf(scan.nextLine());
                    acc.withdraw(ammount);
                break;
                case "c":
                    System.out.println(String.format("Current balance: $%.2f", acc.getBalance()));
                break;
            
                default:
                    program_state = false;
                    System.out.println("Closing");
                    scan.close();
                break;
                
            }
            System.out.println("");
        }
    }
}
