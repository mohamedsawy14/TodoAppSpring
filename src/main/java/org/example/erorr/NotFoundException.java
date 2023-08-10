package org.example.erorr;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiBaseException {
    public NotFoundException(String message){
        super(message);
    }

    @Override
    public HttpStatus getstatus() {
        return HttpStatus.NOT_FOUND;
    }

}
