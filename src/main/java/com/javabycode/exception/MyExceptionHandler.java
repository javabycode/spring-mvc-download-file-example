package com.javabycode.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = FileNotFoundException.class)
    public void handleFileNotFound(FileNotFoundException ex, HttpServletResponse res) throws IOException {
        System.out.println("Handling file not found exception");
        res.sendError(404, ex.getMessage());
    }

    @ExceptionHandler(value = IOException.class)
    public void handleIOExcpeption(IOException ex, HttpServletResponse res) throws IOException {
        System.out.println("Handling io exception");
        res.sendError(500, ex.getMessage());
    }
}
