package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    private int idCuenta;
    private int idDatosFacturación;
    private int idRol;
    private int idGenero;
    private int idObjetivoNutricional;

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
    private int estadoSuscripción;
    @Column(name = "creditos", nullable = false)
    private int creditos;

    public Usuario() {
        super();
    }

    public Usuario(int idUsuario, int idCuenta, int idDatosFacturación, int idRol, int idGenero,
            int idObjetivoNutricional, String nombres, String apellidos, String telefono, int peso, int estatura,
            Date fechaNacimiento, int imc, int kcalRecomendado, int estadoSuscripción, int creditos) {
        super();
        this.idUsuario = idUsuario;
        this.idCuenta = idCuenta;
        this.idDatosFacturación = idDatosFacturación;
        this.idRol = idRol;
        this.idGenero = idGenero;
        this.idObjetivoNutricional = idObjetivoNutricional;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.peso = peso;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
        this.imc = imc;
        this.kcalRecomendado = kcalRecomendado;
        this.estadoSuscripción = estadoSuscripción;
        this.creditos = creditos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getIdDatosFacturación() {
        return idDatosFacturación;
    }

    public void setIdDatosFacturación(int idDatosFacturación) {
        this.idDatosFacturación = idDatosFacturación;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdObjetivoNutricional() {
        return idObjetivoNutricional;
    }

    public void setIdObjetivoNutricional(int idObjetivoNutricional) {
        this.idObjetivoNutricional = idObjetivoNutricional;
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

    public int getEstadoSuscripción() {
        return estadoSuscripción;
    }

    public void setEstadoSuscripción(int estadoSuscripción) {
        this.estadoSuscripción = estadoSuscripción;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

}
