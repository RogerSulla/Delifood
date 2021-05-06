package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@ViewScoped
public class LoginController implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IUsuarioService uS;

    private Usuario usuario;

    @PostConstruct
    public void init() {
        this.usuario = new Usuario();
    }

    public String autenticacion() {
        String redirect = null;

        try {
            Optional<Usuario> usuarioEncontrado = this.uS.autenticacion(usuario);

            int rolID = usuarioEncontrado.get().getRol().getIdRol();

            if (usuarioEncontrado.isPresent()) {
                if (rolID == 1) {
                    redirect = "/panelAdministrador?faces-redirect=true";
                } else {
                    redirect = "/planesSuscripcion?faces-redirect=true";
                }
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas"));
                limpiarUsuario();
            }

        } catch (Exception e) {
            e.printStackTrace();
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
