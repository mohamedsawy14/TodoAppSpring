package org.example.erorr;

import org.springframework.http.HttpStatus;

public class ConfictException extends ApiBaseException {

    public ConfictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getstatus() {
        return HttpStatus.CONFLICT;
    }
}
