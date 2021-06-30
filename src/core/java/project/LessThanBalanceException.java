
package core.java.project;


public class LessThanBalanceException extends Exception {

    String msg;
    
    public LessThanBalanceException() {
        msg="Withdraw amount should be less than Balance";
    }

   
    
    @Override
    public String getMessage(){
        return msg;
    }
}
