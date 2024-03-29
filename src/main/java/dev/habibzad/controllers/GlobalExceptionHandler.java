package dev.habibzad.controllers;


import dev.habibzad.Exceptions.AccountHolderNotFoundException;
import dev.habibzad.Exceptions.NoSuchAccountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({NoSuchAccountException.class})
    public ResponseEntity<String> handleAccountHolderNotFoundException(AccountHolderNotFoundException e){
        return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.NOT_FOUND);
    }


}
