package com.deyang.share.common.exception;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-1-27
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public class ShareException extends Exception{
    public ShareException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public ShareException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public ShareException(String message, Throwable cause) {
        super(message, cause);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public ShareException(Throwable cause) {
        super(cause);    //To change body of overridden methods use File | Settings | File Templates.
    }

    protected ShareException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
