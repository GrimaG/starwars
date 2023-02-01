package com.lucasfilm.starwars.api.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.naming.directory.InvalidAttributesException;
import java.io.InvalidObjectException;


@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(
            value = HttpStatus.NOT_FOUND,
            reason = "Identifier is invalid")
    @ExceptionHandler(IllegalArgumentException.class)
    public void handleException(IllegalArgumentException e) {
    }

    @ResponseStatus(
            value = HttpStatus.BAD_REQUEST,
            reason = "Invalid file inputted")
    @ExceptionHandler(InvalidObjectException.class)
    public void handleException(InvalidObjectException e) {
    }

    @ResponseStatus(
            value = HttpStatus.NOT_FOUND,
            reason = "Invalid id")
    @ExceptionHandler(InvalidAttributesException.class)
    public void handleException(InvalidAttributesException e) {
    }


}