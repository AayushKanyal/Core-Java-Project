
package core.java.project;


public class GreaterThanZeroException extends Exception {

    String msg;
    public GreaterThanZeroException() {
        msg="Deposit Amount should be greater than zero";

    }

  
    @Override
    public String getMessage(){
        return msg;
    }
}