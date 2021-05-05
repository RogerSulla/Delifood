package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.Optional;

import javax.inject.Inject;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

public class UsuarioServiceImpl implements IUsuarioService, Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private IUsuarioDao uD;

    @Override
    public void insertar(Usuario usuario) {
        uD.insertar(usuario);

    }

    @Override
    public void actualizar(Usuario usuario) throws Exception {
        uD.actualizar(usuario);

    }

    @Override
    public Optional<Usuario> autenticacion(Usuario usuario) throws Exception {
        return uD.autenticacion(usuario);
    }

}
