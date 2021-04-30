package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Direccion")
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDireccion;

    private int idUsuario;

    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;
    @Column(name = "referencia", nullable = false, length = 45)
    private String referencia;
    @Column(name = "instruccionesEntrega", nullable = false, length = 45)
    private String instruccionesEntrega;
    
	public Direccion() {
		super();
	}
	
	public Direccion(int idDireccion, int idUsuario, String direccion, String referencia, String instruccionesEntrega) {
		super();
		this.idDireccion = idDireccion;
		this.idUsuario = idUsuario;
		this.direccion = direccion;
		this.referencia = referencia;
		this.instruccionesEntrega = instruccionesEntrega;
	}
	
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getInstruccionesEntrega() {
		return instruccionesEntrega;
	}
	public void setInstruccionesEntrega(String instruccionesEntrega) {
		this.instruccionesEntrega = instruccionesEntrega;
	}
    
    
    
}
