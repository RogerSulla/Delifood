package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ObjetivoNutricional")
public class ObjetivoNutricional implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idObjetivoNutricional;

	@Column(name = "objetivoNutricional", nullable = false, length = 11)
	private String objetivoNutricional;

	public ObjetivoNutricional() {
		super();
	}

	public ObjetivoNutricional(int idObjetivoNutricional) {
		super();
		this.idObjetivoNutricional = idObjetivoNutricional;
	}

	public int getIdObjetivoNutricional() {
		return idObjetivoNutricional;
	}

	public void setIdObjetivoNutricional(int idObjetivoNutricional) {
		this.idObjetivoNutricional = idObjetivoNutricional;
	}

	public String getObjetivoNutricional() {
		return objetivoNutricional;
	}

	public void setObjetivoNutricional(String objetivoNutricional) {
		this.objetivoNutricional = objetivoNutricional;
	}

}
