package com.edu.unab.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "cuidador")
public class Cuidador {
	
	@Id
	@Column(name = "idcuidador")
	private Integer idCuidador;
	@Column(name = "nombre")
	private String nombreCuidador;
	@Column(name = "fecha_nacimiento")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date fechaNacimientoC;
	
	public Cuidador() {}
	public Cuidador(Integer idCuidador, String nombreCuidador, Date fechaNacimientoC) {
		this.idCuidador = idCuidador;
		this.nombreCuidador = nombreCuidador;
		this.fechaNacimientoC = fechaNacimientoC;
	}
	
	public Integer getIdCuidador() {
		return idCuidador;
	}
	public void setIdCuidador(Integer idCuidador) {
		this.idCuidador = idCuidador;
	}
	public String getNombreCuidador() {
		return nombreCuidador;
	}
	public void setNombreCuidador(String nombreCuidador) {
		this.nombreCuidador = nombreCuidador;
	}
	public Date getFechaNacimientoC() {
		return fechaNacimientoC;
	}
	public void setFechaNacimientoC(Date fechaNacimientoC) {
		this.fechaNacimientoC = fechaNacimientoC;
	}
	

	@Override
	public String toString() {
		return "Cuidador [idCuidador=" + idCuidador + ", nombreCuidador=" + nombreCuidador + ", fechaNacimientoC="
				+ fechaNacimientoC + "]";
	}
	
	

}
