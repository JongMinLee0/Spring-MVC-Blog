package com.demo.app.exception.handler;

import com.demo.app.exception.SQLIntegrityConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MemberExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorMessage> handleSQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException ex){
        return getErrorMessageResponseEntity(ex.getMessage(), ex.toString(), HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<ErrorMessage> getErrorMessageResponseEntity(String message, String s, HttpStatus httpStatus) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(message);
        errorMessage.setErrorCode(httpStatus.value());
        errorMessage.setDetail(s);

        return new ResponseEntity<>(errorMessage, httpStatus);
    }

}
