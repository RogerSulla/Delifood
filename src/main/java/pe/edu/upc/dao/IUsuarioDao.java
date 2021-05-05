package pe.edu.upc.dao;

import java.util.Optional;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioDao {
    public void insertar(Usuario usuario);

    public void actualizar(Usuario usuario) throws Exception;

    Optional<Usuario> autenticacion(Usuario usuario) throws Exception;

}
