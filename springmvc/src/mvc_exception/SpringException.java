package mvc_exception;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-22 15:06:29
 **/

public class SpringException extends RuntimeException {
    private String exceptionMsg;
    public SpringException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }
    public String getExceptionMsg(){
        return this.exceptionMsg;
    }
    public void setExceptionMsg(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }
}
