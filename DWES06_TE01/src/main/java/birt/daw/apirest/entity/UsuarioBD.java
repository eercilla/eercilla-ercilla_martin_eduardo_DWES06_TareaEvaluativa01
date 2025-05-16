package birt.daw.apirest.entity;

import jakarta.persistence.Entity;

//import javax.persistence.Column;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;

@Entity
@DynamicUpdate
@Table(name ="usuarios")
public class UsuarioBD {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;
	
	public UsuarioBD() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioBD(int id, String nombre, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
