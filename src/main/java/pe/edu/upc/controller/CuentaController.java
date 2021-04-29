package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cuenta;
import pe.edu.upc.service.iCuentaService;

@Named
@RequestScoped

public class CuentaController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private iCuentaService cService;
    private Cuenta cuenta;

    @PostConstruct
    public void init() {
        this.cuenta = new Cuenta();
    }

    public String registrarCuenta() {
        this.setCuenta(new Cuenta());
        return "registroCuenta.xhtml";
    }

    public void insertar() {
        cService.insertar(cuenta);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
