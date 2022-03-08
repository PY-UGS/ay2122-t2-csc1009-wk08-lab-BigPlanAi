import java.util.*;

import javax.swing.text.StyledEditorKit.BoldAction;

public class CheckingAccount {
    private float balance;
    private int number;


    public CheckingAccount(float value){
        this.balance = value;
    }

    public int getNumber(){
        return this.number;
    }

    public float getBalance(){
        return this.balance;
    }


    public void deposit(float value){
        this.balance += value;
    }


    public void withdraw(float value) throws InsufficientFundsException{
        try{
            if (this.balance < value) {
               throw new InsufficientFundsException( value - balance); 
            }
            this.balance -= value;
            System.out.println(String.format("The balance after withdraw is $%.2f", this.balance));
        }catch(InsufficientFundsException e ){
            System.out.println(e.getMessage());
            System.out.println("Exception caught: " + e);
            
        }
        
    }   
}
