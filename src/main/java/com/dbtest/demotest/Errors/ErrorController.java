package com.dbtest.demotest.Errors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.RequestDispatcher;
import java.util.Date;
import java.util.Objects;

@ControllerAdvice
public class ErrorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {org.hibernate.exception.ConstraintViolationException.class})
    public ResponseEntity<Object> handleConstraintException(org.hibernate.exception.ConstraintViolationException ex, WebRequest request){
        String ErrorMessageDescription = ex.getCause().getLocalizedMessage();
        HttpStatus errorStatus = HttpStatus.I_AM_A_TEAPOT;
        Integer errorStatusCode =  new ResponseEntity(errorStatus).getStatusCodeValue();
        Error errorMessage = new Error(new Date(), "Нарушение целостности связей в таблице!  " + ErrorMessageDescription, errorStatus.toString() + " " , errorStatusCode.toString());

        return new ResponseEntity<>(
                errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );

    }
//    @ExceptionHandler(value = { NullPointerException.class} )
//    public ResponseEntity<Object> handleNullException(Exception ex, WebRequest request){
//        String ErrorMessageDescription = ex.getMessage();
//        HttpStatus errorStatus = HttpStatus.I_AM_A_TEAPOT;
//        Integer errorStatusCode =  new ResponseEntity(errorStatus).getStatusCodeValue();
//        Error errorMessage = new Error(new Date(), "Одно из значений задано неверно по формату!  " + ErrorMessageDescription, errorStatus.toString() + " " , errorStatusCode.toString());
//
//        return new ResponseEntity<>(
//                errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
//        );
//
//    }

}
