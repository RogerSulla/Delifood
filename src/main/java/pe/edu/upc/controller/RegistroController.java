package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@ViewScoped
public class RegistroController implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IUsuarioService uS;

    private Usuario usuario;

    @PostConstruct
    public void init() {
        this.usuario = new Usuario();
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
            this.uS.insertar(usuario);
            limpiarUsuario();

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
