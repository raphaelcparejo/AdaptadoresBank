package br.com.adaptadores.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.adaptadores.service.exceptions.ServicoServiceException;

@ControllerAdvice
public class ExceptionHandlerAdviceService {
	
	  @ExceptionHandler(ServicoServiceException.class)
	    public ResponseEntity<Exception> handleException(Exception e) {
	        
	        return ResponseEntity
	                .status(HttpStatus.BAD_GATEWAY)
	                .body(e);
	    }    

}
