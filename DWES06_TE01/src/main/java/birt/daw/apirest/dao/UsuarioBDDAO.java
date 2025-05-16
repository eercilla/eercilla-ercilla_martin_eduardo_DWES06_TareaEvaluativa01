package birt.daw.apirest.dao;

import java.util.List;

import birt.daw.apirest.entity.UsuarioBD;

public interface UsuarioBDDAO {
	public List<UsuarioBD> obtenerUsuarios();
	public void save(UsuarioBD usuario);
}
