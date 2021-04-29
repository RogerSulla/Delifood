package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iCuentaDao;
import pe.edu.upc.entity.Cuenta;

public class CuentaDaoImpl implements iCuentaDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName = "a")
    private EntityManager em;

    @Transactional
    @Override
    public void insertar(Cuenta cuenta) {
        em.persist(cuenta);
    }

}
