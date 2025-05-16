package birt.daw.apirest.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.http.HttpStatus;




@RestControllerAdvice
public class GlobalExceptionHandler {

//	public GlobalExceptionHandler() {
//		// TODO Auto-generated constructor stub
//	}

	// Si error provocado por validación incorrecta (campos vacíos o email de forma incorrecta en nuestro caso)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, Object>> handleValidationException(MethodArgumentNotValidException ex) {
		Map<String, Object> errorResponse = new HashMap<>();
		errorResponse.put("status", "Error");
		errorResponse.put("mensaje", ex.getBindingResult().getFieldError().getDefaultMessage());
		errorResponse.put("code", "400 Bad Request");
		
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}
	
	// Si otro tipo de error 
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneralException(Exception ex) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("status", "Error");
        errorResponse.put("mensaje", "Ha ocurrido un error interno");
        errorResponse.put("detalle", ex.getMessage());
        errorResponse.put("code", "500 Internal Server Error");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}
