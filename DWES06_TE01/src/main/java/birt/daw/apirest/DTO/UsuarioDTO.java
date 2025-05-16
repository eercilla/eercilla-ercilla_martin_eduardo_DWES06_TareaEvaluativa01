package birt.daw.apirest.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDTO {
	
	@NotBlank(message = "El nombre no puede estar vacío") // Nombre no puede estar en blanco
	private String nombre;
	
    @Email(message = "El email debe ser válido") // Contiene un mail con la forma xxx@yyy
    @NotBlank(message = "El email no puede estar vacío") 
    private String email;

	public UsuarioDTO() {
		// TODO Auto-generated constructor stub

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
