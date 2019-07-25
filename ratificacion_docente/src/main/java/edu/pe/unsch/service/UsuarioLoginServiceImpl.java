package edu.pe.unsch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.unsch.dao.UsuarioDAO;
import edu.pe.unsch.entity.UsuarioEntity;

@Service
@Transactional
public class UsuarioLoginServiceImpl implements UsuarioLoginService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	
	@Override
	public UsuarioEntity login(String email, String pass) {
		return (UsuarioEntity) usuarioDAO.login(email, pass);
	}
}
