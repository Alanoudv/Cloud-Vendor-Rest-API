package com.project.CloudVendorAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// HANDLE ALL THIS EXCEPTION
@ControllerAdvice
public class CloudVendorExceptionHandler {
    @ExceptionHandler(value = {CloudVendorNotFoundException.class})
    //^^^this will have a list of exception that will handled by the method(handleCloudVendorNotFoundException)


    // between the <> th the type we want and now we want an object type
    public ResponseEntity <Object> handleCloudVendorNotFoundException
    (CloudVendorNotFoundException cloudVendorNotFoundException)
    {
        //creating the payload that will go inside the CloudVendorException anf can return back with the helpof response entity
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorNotFoundException.getMessage()
        ,cloudVendorNotFoundException.getCause()
            , HttpStatus.NOT_FOUND
            );
        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }
}

