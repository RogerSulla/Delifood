package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

    @Override
    public void actualizar(Usuario usuario) throws Exception {
        try {
            em.merge(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public Optional<Usuario> autenticacion(Usuario usuario) throws Exception {
        Usuario usuarioEncontrado;
        TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.email = ?1 and u.password = ?2",
                Usuario.class);
        query.setParameter(1, usuario.getEmail());
        query.setParameter(2, usuario.getPassword());

        usuarioEncontrado = query.getSingleResult();

        return Optional.of(usuarioEncontrado);
    }

}
