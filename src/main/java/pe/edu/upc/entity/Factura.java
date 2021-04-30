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
@Table(name = "Factura")
public class Factura implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idFactura;
    public int idPlan;
    public int idTarjeta;

    public Date fechaFacturacion;
    public int tipoComprobante;

    @Column(name = "tipoIdentificacion", nullable = false, length = 10)
    public String tipoIdentificacion;
    public int numeroIdentificacion;
    @Column(name = "nombresFacturacion", nullable = false, length = 25)
    public String nombresFacturacion;
    
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(int idFactura, int idPlan, int idTarjeta, Date fechaFacturacion, int tipoComprobante,
			String tipoIdentificacion, int numeroIdentificacion, String nombresFacturacion) {
		super();
		this.idFactura = idFactura;
		this.idPlan = idPlan;
		this.idTarjeta = idTarjeta;
		this.fechaFacturacion = fechaFacturacion;
		this.tipoComprobante = tipoComprobante;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombresFacturacion = nombresFacturacion;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Date getFechaFacturacion() {
		return fechaFacturacion;
	}

	public void setFechaFacturacion(Date fechaFacturacion) {
		this.fechaFacturacion = fechaFacturacion;
	}

	public int getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(int tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombresFacturacion() {
		return nombresFacturacion;
	}

	public void setNombresFacturacion(String nombresFacturacion) {
		this.nombresFacturacion = nombresFacturacion;
	}
    
    
}
