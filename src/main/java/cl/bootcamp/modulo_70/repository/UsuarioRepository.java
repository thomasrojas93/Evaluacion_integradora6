package cl.bootcamp.modulo_70.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.bootcamp.modulo_70.entity.UsuarioEntity;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity,Integer>{

	UsuarioEntity searchByUsername(String email);
	UsuarioEntity findByUsername(String username);
	@Modifying
    @Transactional
    @Query("UPDATE UsuarioEntity u SET u.saldo = u.saldo + :amount WHERE u.id = :usuarioId")
    void updateSaldo(@Param("usuarioId") int Id,@Param("amount")  double amount);

}
