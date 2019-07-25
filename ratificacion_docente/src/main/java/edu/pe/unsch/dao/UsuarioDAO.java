package edu.pe.unsch.dao;

import edu.pe.unsch.entity.Usuario;

public interface UsuarioDAO {
	
	Usuario login(String email, String pass);
}
