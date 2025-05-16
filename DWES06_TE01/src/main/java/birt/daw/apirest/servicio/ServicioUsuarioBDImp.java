package birt.daw.apirest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import birt.daw.apirest.entity.Usuario;
import birt.daw.apirest.entity.UsuarioBD;
import birt.daw.apirest.dao.*;

@Service
public class ServicioUsuarioBDImp implements ServicioUsuarioBD {
	
	@Autowired
	private UsuarioBDDAO usuarioBDDAO;

	public ServicioUsuarioBDImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UsuarioBD> obtenerUsuarios() {
		List<UsuarioBD> listaUsuarios = usuarioBDDAO.obtenerUsuarios();
		return listaUsuarios;
	}

	@Override
	public void save(UsuarioBD usuarioBD) {
		// Obtiene la lista de usuarios a través del DAO
		usuarioBDDAO.save(usuarioBD);
	}

}
