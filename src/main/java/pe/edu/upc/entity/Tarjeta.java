package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    private int idUsuario;

    @Column(name = "nombreTitular", nullable = false, length = 25)
    private String nombreTitular;
    private int numeroTarjeta;
    private Date fechaVencimiento;
    private int cvv;
	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarjeta(int idTarjeta, int idUsuario, String nombreTitular, int numeroTarjeta, Date fechaVencimiento,
			int cvv) {
		super();
		this.idTarjeta = idTarjeta;
		this.idUsuario = idUsuario;
		this.nombreTitular = nombreTitular;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.cvv = cvv;
	}
	public int getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
    
    
}
