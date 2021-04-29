package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iCuentaDao;
import pe.edu.upc.entity.Cuenta;
import pe.edu.upc.service.iCuentaService;

@Named
@RequestScoped

public class CuentaServiceImpl implements iCuentaService, Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private iCuentaDao cD;

    @Override
    public void insertar(Cuenta cuenta) {
        cD.insertar(cuenta);

    }
}
