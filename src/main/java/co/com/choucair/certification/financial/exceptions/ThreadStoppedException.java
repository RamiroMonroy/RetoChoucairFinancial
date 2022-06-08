package co.com.choucair.certification.financial.exceptions;

public class ThreadStoppedException extends RuntimeException {

    public ThreadStoppedException(String message, Throwable cause){
        super(message,cause);
    }
}
