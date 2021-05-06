package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IRolService;
import pe.edu.upc.service.IUsuarioService;

@Named
@ViewScoped
public class RegistroController implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IUsuarioService uS;

    @Inject
    IRolService rS;

    private Usuario usuario;

    @PostConstruct
    public void init() {
        this.usuario = new Usuario();
        rS.initRol();
    }

    public String nuevoUsuario() {
        this.setUsuario(new Usuario());
        return "registroUsuario.xhtml";
    }

    public String registrarUsuario() {

        String redirect = null;
        try {
            String password = this.usuario.getPassword();
            this.usuario.setPassword(password);
            this.usuario.setRol(new Rol(2));
            this.uS.insertar(usuario);

            redirect = "/registroPerfil?faces-redirect=true";

        } catch (Exception e) {
            System.out.println(e.getMessage());
            limpiarUsuario();
        }

        return redirect;
    }

    public String registroPerfil() {
        String redirect = null;
        try {
            this.uS.actualizar(usuario);
            redirect = "/panelUsuario?faces-redirect=true";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return redirect;
    }

    public void limpiarUsuario() {
        this.init();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
