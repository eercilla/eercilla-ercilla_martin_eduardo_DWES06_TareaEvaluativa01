package birt.daw.apirest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import birt.daw.apirest.entity.*;
import birt.daw.apirest.servicio.*;
import jakarta.validation.Valid;
import birt.daw.apirest.DTO.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	public UsuarioController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private ServicioUsuario servicioUsuario;
	
	@Autowired
	private ServicioUsuarioBD servicioUsuarioBD;

	@GetMapping("/usuarios")
	public ResponseEntity<Map<String, Object>> obtenerUsuarios(){
		List<Usuario> listaUsuarios = servicioUsuario.obtenerUsuarios();
		
		// Creamos un objeto Map de la forma clave-valor, para representar el mensaje de salida
		Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("status", "Success");
	    respuesta.put("mensaje", "Recurso encontrado con exito");
	    respuesta.put("code", "200 OK");
	    respuesta.put("usuarios", listaUsuarios); // Completamos la respuesta con la lista de usuarios
	
	    return ResponseEntity.ok(respuesta);
	}
	
	
	//***************** Código para la parte de la base de datos ************************
	
	// Método GET
	@GetMapping("/usuariosBD")
	public ResponseEntity<Map<String, Object>> obtenerUsuariosBD(){
		List<UsuarioBD> listaUsuarios = servicioUsuarioBD.obtenerUsuarios();
		
		// Creamos un objeto Map de la forma clave-valor, para representar el mensaje de salida
		Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("status", "Success");
	    respuesta.put("mensaje", "Recurso encontrado con exito");
	    respuesta.put("code", "200 OK");
	    respuesta.put("usuarios", listaUsuarios); // Completamos la respuesta
	
	    return ResponseEntity.ok(respuesta);
	}
	
	// Método POST
	@PostMapping("/usuariosBD")
	public ResponseEntity<Map<String, Object>> guardarUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
		
		// Una vez validado mediante DTO convertimos al modelo y se lo pasamos al servicio
		UsuarioBD usuarioBD = new UsuarioBD();
	    usuarioBD.setNombre(usuarioDTO.getNombre());
	    usuarioBD.setEmail(usuarioDTO.getEmail());
		
	    servicioUsuarioBD.save(usuarioBD);

	 // Creamos un objeto Map de la forma clave-valor, para representar el mensaje de salida
	    Map<String, Object> respuesta = new HashMap<>();
	    respuesta.put("status", "Success");
	    respuesta.put("mensaje", "Usuario creado con éxito");
	    respuesta.put("code", "201 Created");
	    respuesta.put("usuario", usuarioBD);

	    return ResponseEntity.status(201).body(respuesta);
	}

}
