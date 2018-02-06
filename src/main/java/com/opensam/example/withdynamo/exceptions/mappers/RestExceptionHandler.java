/*
package com.opensam.example.withdynamo.exceptions.mappers;

import com.opensam.example.withdynamo.controllers.ContactController;
import com.opensam.example.withdynamo.dataformat.ApiError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackageClasses = ContactController.class)
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String error = "Malformed JSON request123";
        return buildResponseEntity(new ApiError(error, HttpStatus.BAD_REQUEST));
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<Object>(apiError.getHttpStatus());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<Object> handleEntityNotFound(
            IllegalArgumentException ex) {
        ApiError apiError = new ApiError();
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }

}
*/
