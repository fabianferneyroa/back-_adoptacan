package com.edu.unab.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "perro")
public class Perro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idperro")
	private Integer idPerro;
	@Column(name = "nombre")
	private String nombrePerro;
	@Column(name = "caracteristicas")
	private String caracteristicas;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@ManyToOne
	@JoinColumn(name = "idcuidador")
	private Cuidador cuidador;
	@ManyToOne
	@JoinColumn(name = "estado")
	private Estado estado;
	
	@JoinTable(
			name = "patrocinador_perro",
			joinColumns = @JoinColumn(name = "idperro", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="idpatrocinador", nullable = false))
	
	@ManyToMany
	private List<Patrocinador> patrocinadores;
	
	public Perro() {
	
		
	}
	public Perro(Integer idPerro, String nombrePerro, String caracteristicas, Date fechaNacimiento, Cuidador cuidador,
			Estado estado) {
		super();
		this.idPerro = idPerro;
		this.nombrePerro = nombrePerro;
		this.caracteristicas = caracteristicas;
		this.fechaNacimiento = fechaNacimiento;
		this.cuidador = cuidador;
		this.estado = estado;
	}
	
	public Integer getIdPerro() {
		return idPerro;
	}
	public void setIdPerro(Integer idPerro) {
		this.idPerro = idPerro;
	}
	public String getNombrePerro() {
		return nombrePerro;
	}
	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Cuidador getCuidador() {
		return cuidador;
	}
	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Perro [idPerro=" + idPerro + ", nombrePerro=" + nombrePerro + ", caracteristicas=" + caracteristicas
				+ ", fechaNacimiento=" + fechaNacimiento + ", cuidador=" + cuidador + ", estado=" + estado + "]";
	}
	
	
	
}
