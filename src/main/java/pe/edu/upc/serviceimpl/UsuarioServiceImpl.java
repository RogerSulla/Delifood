package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.inject.Inject;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

public class UsuarioServiceImpl implements IUsuarioService, Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private IUsuarioDao mD;

    @Override
    public void insertar(Usuario usuario) {
        mD.insertar(usuario);

    }

}
