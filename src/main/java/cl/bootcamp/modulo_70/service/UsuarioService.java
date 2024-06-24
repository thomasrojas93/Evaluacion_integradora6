package cl.bootcamp.modulo_70.service;

import java.util.List;

import cl.bootcamp.modulo_70.model.Usuario;

public interface UsuarioService {

	Usuario getByUsername(String username);
	int crear(Usuario usuario);
	int editar(Usuario usuario);
	List<Usuario> listado();
	Usuario getById(int id);
}
