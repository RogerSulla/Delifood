package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	@ManyToOne
	@JoinColumn(name = "idRol")
	private Rol rol;

	@ManyToOne
	@JoinColumn(name = "idGenero")
	private Genero genero;

	@ManyToOne
	@JoinColumn(name = "idObjetivoNutricional")
	private ObjetivoNutricional objetivoNutricional;

	@Column(name = "nombres", nullable = false, length = 25)
	private String nombres;
	@Column(name = "apellidos", nullable = false, length = 25)
	private String apellidos;
	@Column(name = "telefono", nullable = false, length = 15)
	private String telefono;

	@Column(name = "peso", nullable = false)
	private int peso;
	@Column(name = "estatura", nullable = false)
	private int estatura;
	@Column(name = "fechaNacimiento", nullable = false)
	private Date fechaNacimiento;
	@Column(name = "imc", nullable = false)
	private int imc;
	@Column(name = "kcalRecomendado", nullable = false)
	private int kcalRecomendado;
	@Column(name = "estadoSuscripción", nullable = false)
	private int estadoSuscripcion;
	@Column(name = "creditos", nullable = false)
	private int creditos;

	@Column(name = "email", nullable = false, length = 25)
	private String email;
	@Column(name = "password", nullable = false, length = 25)
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, Rol rol, Genero genero, ObjetivoNutricional objetivoNutricional, String nombres,
			String apellidos, String telefono, int peso, int estatura, Date fechaNacimiento, int imc,
			int kcalRecomendado, int estadoSuscripcion, int creditos, String email, String password) {
		super();
		this.idUsuario = idUsuario;
		this.rol = rol;
		this.genero = genero;
		this.objetivoNutricional = objetivoNutricional;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.peso = peso;
		this.estatura = estatura;
		this.fechaNacimiento = fechaNacimiento;
		this.imc = imc;
		this.kcalRecomendado = kcalRecomendado;
		this.estadoSuscripcion = estadoSuscripcion;
		this.creditos = creditos;
		this.email = email;
		this.password = password;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public ObjetivoNutricional getObjetivoNutricional() {
		return objetivoNutricional;
	}

	public void setObjetivoNutricional(ObjetivoNutricional objetivoNutricional) {
		this.objetivoNutricional = objetivoNutricional;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getImc() {
		return imc;
	}

	public void setImc(int imc) {
		this.imc = imc;
	}

	public int getKcalRecomendado() {
		return kcalRecomendado;
	}

	public void setKcalRecomendado(int kcalRecomendado) {
		this.kcalRecomendado = kcalRecomendado;
	}

	public int getEstadoSuscripcion() {
		return estadoSuscripcion;
	}

	public void setEstadoSuscripcion(int estadoSuscripcion) {
		this.estadoSuscripcion = estadoSuscripcion;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
