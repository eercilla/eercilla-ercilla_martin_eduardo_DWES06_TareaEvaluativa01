package birt.daw.apirest.servicio;

import java.util.List;

import birt.daw.apirest.entity.UsuarioBD;

public interface ServicioUsuarioBD {

	public List<UsuarioBD> obtenerUsuarios();
	public void save(UsuarioBD usuario);
}
