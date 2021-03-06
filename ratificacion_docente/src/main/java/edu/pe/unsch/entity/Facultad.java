package edu.pe.unsch.entity;
// Generated 24-jul-2019 23:10:45 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Facultad generated by hbm2java
 */
@Entity
@Table(name = "facultad", catalog = "ratificacionbd")
public class Facultad implements java.io.Serializable {

	private int idFacultad;
	private String nombreFacultad;
	private String codigoFacultad;
	private Set<Docente> docentes = new HashSet<Docente>(0);

	public Facultad() {
	}

	public Facultad(int idFacultad, String nombreFacultad, String codigoFacultad) {
		this.idFacultad = idFacultad;
		this.nombreFacultad = nombreFacultad;
		this.codigoFacultad = codigoFacultad;
	}

	public Facultad(int idFacultad, String nombreFacultad, String codigoFacultad, Set<Docente> docentes) {
		this.idFacultad = idFacultad;
		this.nombreFacultad = nombreFacultad;
		this.codigoFacultad = codigoFacultad;
		this.docentes = docentes;
	}

	@Id

	@Column(name = "id_facultad", unique = true, nullable = false)
	public int getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}

	@Column(name = "nombre_facultad", nullable = false, length = 50)
	public String getNombreFacultad() {
		return this.nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	@Column(name = "codigo_facultad", nullable = false, length = 10)
	public String getCodigoFacultad() {
		return this.codigoFacultad;
	}

	public void setCodigoFacultad(String codigoFacultad) {
		this.codigoFacultad = codigoFacultad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public Set<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}

}
