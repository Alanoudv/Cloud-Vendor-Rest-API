package com.project.CloudVendorAPI.exception;

//RuntimeException = so that can be recognized as exception class
public class CloudVendorNotFoundException extends RuntimeException{
    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
