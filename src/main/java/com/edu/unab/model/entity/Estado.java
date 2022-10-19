package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
	
	@Id
	@Column(name="idestado")
	private Integer idEstado;
	@Column(name="nombre")
	private String nombreEstado;
	
	public Estado() {
		
	}
	
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getNombreEstado() {
		return nombreEstado;
	}
	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}
	public Estado(Integer idEstado, String nombreEstado) {
		super();
		this.idEstado = idEstado;
		this.nombreEstado = nombreEstado;
	}
	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", nombreEstado=" + nombreEstado + "]";
	}
	
	

}
