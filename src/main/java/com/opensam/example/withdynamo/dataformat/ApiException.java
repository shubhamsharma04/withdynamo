package com.opensam.example.withdynamo.dataformat;

import java.util.Date;

// TODO : Use this somewhere
public class ApiException extends RuntimeException{
    private int httpStatus;
    private Date date;
    private String message;

    public ApiException() {
        date = new Date();
    }

    public ApiException(String message) {
        date = new Date();
        this.message = message;
    }

    public ApiException(String message, int httpStatus) {
        date = new Date();
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
