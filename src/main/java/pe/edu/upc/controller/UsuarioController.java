package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private IUsuarioService mService;
    private Usuario usuario;

    @PostConstruct
    public void init() {
        this.usuario = new Usuario();
    }

    public String nuevoUsuario() {
        this.setUsuario(new Usuario());
        return "registroUsuario.xhtml";
    }

    public void insertar() {
        try {
            mService.insertar(usuario);
            limpiarUsuario();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
