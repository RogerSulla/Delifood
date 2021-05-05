package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.inject.Inject;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.service.IRolService;

public class RolServiceImpl implements IRolService, Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IRolDao rD;

    @Override
    public void initRol() {
        rD.insertar();

    }
}
