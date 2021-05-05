package pe.edu.upc.service;

import java.util.Optional;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioService {
    public void insertar(Usuario usuario);

    public void actualizar(Usuario usuario) throws Exception;

    Optional<Usuario> autenticacion(Usuario usuario) throws Exception;
}
