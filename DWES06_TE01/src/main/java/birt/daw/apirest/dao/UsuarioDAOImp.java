package birt.daw.apirest.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import birt.daw.apirest.entity.*;

@Repository
public class UsuarioDAOImp implements UsuarioDAO {

	
//	public UsuarioDAOImp() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	@Transactional
	public List<Usuario> obtenerUsuarios() {

		// Lista de usuarios simulada (no accede a la BD)
        return Arrays.asList(
                new Usuario(1, "Eduardo", "eercilla@birt.eus"),
                new Usuario(2, "Pepe", "ppepe@birt.eus"),
                new Usuario(3, "María", "mmaria@birt.eus")
            );
	}

}
