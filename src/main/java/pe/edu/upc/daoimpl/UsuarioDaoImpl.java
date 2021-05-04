package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao, Serializable {
    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName = "a")
    private EntityManager em;

    @Transactional
    @Override
    public void insertar(Usuario usuario) {
        try {
            em.persist(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }

    }

}
