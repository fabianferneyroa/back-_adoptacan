package com.edu.unab.model.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="patrocinador")

public class Patrocinador {
	
	@Id
	@Column(name="idpatrocinador")
	private Integer idPatrocinador;
	@Column(name="nombre")
	private String nombreP;
	@Column(name="telefono")
	private String telefonoP;
	@Column(name="direccion")
	private String direcconP;
	
	@ManyToMany(mappedBy = "patrocinadores")
    private List<Perro> perros;
	
	public Patrocinador() {
	}
	
	public Patrocinador(Integer idPatrocinador, String nombreP, String telefonoP, String direcconP) {
		this.idPatrocinador = idPatrocinador;
		this.nombreP = nombreP;
		this.telefonoP = telefonoP;
		this.direcconP = direcconP;
	}
	
	public Integer getIdPatrocinador() {
		return idPatrocinador;
	}
	public void setIdPatrocinador(Integer idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getTelefonoP() {
		return telefonoP;
	}
	public void setTelefonoP(String telefonoP) {
		this.telefonoP = telefonoP;
	}
	public String getDirecconP() {
		return direcconP;
	}
	public void setDirecconP(String direcconP) {
		this.direcconP = direcconP;
	}
	
	@Override
	public String toString() {
		return "Patrocinador [idPatrocinador=" + idPatrocinador + ", nombreP=" + nombreP + ", telefonoP=" + telefonoP
				+ ", direcconP=" + direcconP + "]";
	}
	
	
}


