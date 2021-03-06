package co.com.choucair.certification.financial.util;

import co.com.choucair.certification.financial.exceptions.ThreadStoppedException;

import static co.com.choucair.certification.financial.util.Constants.THREAD_STOPPED_EXCEPTION_MESSAGE;

public class Wait {

    public static void stopExecution(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ThreadStoppedException(THREAD_STOPPED_EXCEPTION_MESSAGE,e);
        }
    }
}
