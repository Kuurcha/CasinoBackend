package com.dbtest.demotest.Errors;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class Error {
    private Date timestamp;
    private String message;
    private String httpStatus;

    Error(){

    }
    Error(Date timestamp, String message, HttpStatus httpStatus){
        this.timestamp = timestamp;
        this.message = message;
        this.httpStatus =  httpStatus.getReasonPhrase();
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
