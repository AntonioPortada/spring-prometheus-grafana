package com.tyj.prometheus_grafana.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> errorPrueba(IllegalArgumentException ex) {
        return ResponseEntity.status(505).body(new Error("Error prueba", ex.getMessage()));
    }

}
