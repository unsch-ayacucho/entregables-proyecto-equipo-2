package edu.pe.unsch.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.unsch.entity.Usuario;

@Repository
@Transactional
public class UsuarioDAOImpl implements UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Usuario login(String email, String pass) {
		
		Usuario usuario;
		
		try {
			usuario = (Usuario) entityManager.
							createQuery("from  Usuario " +
							"where  email =  :email and " + 
							"password  =  :password").
							setParameter("email", email).
							setParameter("password", pass).
							getSingleResult();
			System.out.println("Usuario encontrado para: " + email);
			
		} catch (NoResultException e) {
			System.out.println("No existe usuario para: " + email);
			return null;
		}
		
		return usuario;
	}

}
