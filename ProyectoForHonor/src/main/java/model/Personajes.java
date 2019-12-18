package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personaje")
public class Personajes {

	private Integer personaje_id;
	private String nombre_personaje;
	private int ataque;
	private int defensa;
	private int faccion_id;
	
	@Column(name = "personaje_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPersonaje_id() {
		return personaje_id;
	}

	@Column(name = "nombre_persoanje")
	public String getNombre_personaje() {
		return nombre_personaje;
	}

	@Column(name = "ataque")
	public int getAtaque() {
		return ataque;
	}

	@Column(name = "defensa")
	public int getDefensa() {
		return defensa;
	}

	@Column(name = "faccion_id")
	public int getFaccion_id() {
		return faccion_id;
	}

	@Override
	public String toString() {
		return "Personajes [personaje_id=" + personaje_id + ", nombre_personaje=" + nombre_personaje + ", ataque="
				+ ataque + ", defensa=" + defensa + ", faccion_id=" + faccion_id + "]";
	}
	
	
}
