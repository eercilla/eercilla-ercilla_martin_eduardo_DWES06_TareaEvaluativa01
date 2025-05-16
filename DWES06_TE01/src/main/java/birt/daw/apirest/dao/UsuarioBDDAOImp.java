package birt.daw.apirest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import birt.daw.apirest.entity.UsuarioBD;
//import jakarta.persistence.EntityManager;
import jakarta.persistence.*;
import jakarta.transaction.*;

@Repository
public class UsuarioBDDAOImp implements UsuarioBDDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
//	public UsuarioBDDAOImp() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	@Transactional
	public List<UsuarioBD> obtenerUsuarios() {
		
//        return entityManager.createQuery("SELECT u FROM UsuarioBD u", UsuarioBD.class).getResultList();
		
        return entityManager.createQuery("SELECT u FROM UsuarioBD u", UsuarioBD.class).getResultList();
//		Session currentSession= entityManager.unwrap(Session.class);
//		Query<UsuarioBD> theQuery= currentSession.createQuery("from Usuarios",Alumno.class);
//		List<UsuarioBD> usuario = theQuery.getResultList();
//		return usuario;

	}

	@Override
	@Transactional
	public void save(UsuarioBD usuarioBD) {
		// TODO Auto-generated method stub
		
//	    if (usuarioBD.getId() == 0) {  // Si no tiene ID, es un nuevo usuario
//	        entityManager.persist(usuarioBD);
//	    } else {  // Si tiene ID, actualiza el existente
//	        entityManager.merge(usuarioBD);
//	    }
		entityManager.persist(usuarioBD);
	}

}
