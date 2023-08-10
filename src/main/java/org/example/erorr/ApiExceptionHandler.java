package org.example.erorr;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ApiBaseException.class)
    public ResponseEntity<ErorrDetails> handlerException(ApiBaseException ex , WebRequest request) {
        ErorrDetails details = new ErorrDetails(ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(details, ex.getstatus());
    }

}
