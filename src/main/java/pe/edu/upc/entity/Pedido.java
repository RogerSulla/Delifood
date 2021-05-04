package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;

	@ManyToOne
	@JoinColumn(name = "idDireccion")
	private Direccion direccion;

	private Date horarioEntrega;
	private Date fechaPedido;
	private int costoCreditos;

	public Pedido() {
		super();
	}

	public Pedido(int idPedido, Direccion direccion, Date horarioEntrega, Date fechaPedido, int costoCreditos) {
		super();
		this.idPedido = idPedido;
		this.direccion = direccion;
		this.horarioEntrega = horarioEntrega;
		this.fechaPedido = fechaPedido;
		this.costoCreditos = costoCreditos;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Date getHorarioEntrega() {
		return horarioEntrega;
	}

	public void setHorarioEntrega(Date horarioEntrega) {
		this.horarioEntrega = horarioEntrega;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getCostoCreditos() {
		return costoCreditos;
	}

	public void setCostoCreditos(int costoCreditos) {
		this.costoCreditos = costoCreditos;
	}

}
