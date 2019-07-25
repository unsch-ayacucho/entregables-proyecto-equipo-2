package edu.pe.unsch.entity;

import java.util.Date;
import java.util.Set;

public interface UsuarioEntity {

	public Integer getIdUsuario();
	public void setIdUsuario(Integer idUsuario);
	public Firma getFirma();
	public void setFirma(Firma firma);
	public Persona getPersona();
	public void setPersona(Persona persona);
	public String getEmail();
	public void setEmail(String email);
	public String getPassword();
	public void setPassword(String password);
	public String getCargo() ;
	public void setCargo(String cargo);
	public String getRol();
	public void setRol(String rol) ;
	public Date getUltimoLogin();
	public void setUltimoLogin(Date ultimoLogin);
	public byte[] getFoto();
	public void setFoto(byte[] foto);
	public Set<Documento> getDocumentos();
	public void setDocumentos(Set<Documento> documentos);
}
