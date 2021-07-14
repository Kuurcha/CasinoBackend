package com.dbtest.demotest.Errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public class Error {
    private Date timestamp;
    private String message;
    private String httpStatus;
    private String status;
    Error(){

    }
    Error(Date timestamp, String message, String httpStatus, String status){
        this.timestamp = timestamp;
        this.message = message;
        this.httpStatus =  httpStatus;
        this.status = status;
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

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
