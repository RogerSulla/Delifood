package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DetallePedido")
public class DetallePedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetallePedido;

    private int idPedido;
    private int idComida;
    
	public DetallePedido() {
		super();
	}
	
	public DetallePedido(int idDetallePedido, int idPedido, int idComida) {
		super();
		this.idDetallePedido = idDetallePedido;
		this.idPedido = idPedido;
		this.idComida = idComida;
	}
	
	public int getIdDetallePedido() {
		return idDetallePedido;
	}
	public void setIdDetallePedido(int idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdComida() {
		return idComida;
	}
	public void setIdComida(int idComida) {
		this.idComida = idComida;
	}
        
}
