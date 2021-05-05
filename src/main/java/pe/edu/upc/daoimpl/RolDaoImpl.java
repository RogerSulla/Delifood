package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.entity.Rol;

public class RolDaoImpl implements IRolDao, Serializable {
    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName = "a")
    private EntityManager em;

    @Transactional
    @Override
    public void insertar() {

        Rol rolAdmin = new Rol();
        rolAdmin.setNombreRol("Administrador");

        Rol rolCliente = new Rol();
        rolCliente.setNombreRol("Cliente");

        try {
            em.persist(rolAdmin);
            em.persist(rolCliente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
