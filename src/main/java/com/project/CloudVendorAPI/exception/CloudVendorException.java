package com.project.CloudVendorAPI.exception;

import org.springframework.http.HttpStatus;

//the entire exception details  will be failed and passed back to the client
public class CloudVendorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    //constructor
    public CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    // GETTER
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}



