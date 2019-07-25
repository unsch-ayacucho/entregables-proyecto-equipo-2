package edu.pe.unsch.service;


import edu.pe.unsch.entity.UsuarioEntity;


public interface UsuarioLoginService {

	UsuarioEntity login(String email, String pass);
}
