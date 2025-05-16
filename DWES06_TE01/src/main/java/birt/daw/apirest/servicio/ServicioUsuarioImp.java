package birt.daw.apirest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import birt.daw.apirest.entity.Usuario;
import birt.daw.apirest.dao.*;

@Service
public class ServicioUsuarioImp implements ServicioUsuario {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	public ServicioUsuarioImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		// Obtiene la lista de usuarios a través del DAO
		List<Usuario> listaUsuarios = usuarioDAO.obtenerUsuarios();
		return listaUsuarios;
	}

}
