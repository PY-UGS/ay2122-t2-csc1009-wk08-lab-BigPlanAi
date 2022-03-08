import java.io.*;

public class InsufficientFundsException extends RuntimeException {
    private float ammount; 

    public InsufficientFundsException(float ammount){
        this.ammount = ammount;
    }

    public String getMessage(){
        return ("Sorry, but your account is short by : $"  + this.ammount) ;
    }
}
