package wk10;
/**
 * @author Zhe Wang
 * The University of Melbourne
 */
public class PasswordCheckException extends Exception{
    public PasswordCheckException(String msg){
        super(msg);
    }

    public PasswordCheckException(){
        super("Wrong ! put again!");
    }
}
