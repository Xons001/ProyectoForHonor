package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faccion")
public class Faccion {

	private Integer faccion_id;
	private String nombre_faccion;
	private String lore;
	
	@Column(name = "faccion_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getFaccion_id() {
		return faccion_id;
	}

	@Column(name = "nombre_faccion")
	public String getNombre_faccion() {
		return nombre_faccion;
	}

	@Column(name = "lore")
	public String getLore() {
		return lore;
	}

	@Column(name = "faccion_id")
	public void setFaccion_id(Integer faccion_id) {
		this.faccion_id = faccion_id;
	}

	@Column(name = "nombre_faccion")
	public void setNombre_faccion(String nombre_faccion) {
		this.nombre_faccion = nombre_faccion;
	}

	@Column(name = "lore")
	public void setLore(String lore) {
		this.lore = lore;
	}

	@Override
	public String toString() {
		return "Faccion [faccion_id=" + faccion_id + ", nombre_faccion=" + nombre_faccion + ", lore=" + lore + "]";
	}

}
