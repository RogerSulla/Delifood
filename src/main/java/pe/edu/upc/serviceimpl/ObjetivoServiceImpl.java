package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.inject.Inject;

import pe.edu.upc.dao.IObjetivoDao;
import pe.edu.upc.service.IObjetivoService;

public class ObjetivoServiceImpl implements IObjetivoService, Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IObjetivoDao oD;

    @Override
    public void inicializar() {
        oD.inicializar();

    }

}
