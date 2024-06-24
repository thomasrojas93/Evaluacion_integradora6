package cl.bootcamp.modulo_70.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.bootcamp.modulo_70.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionEntity, Integer> {
    List<TransactionEntity> findByUserId(int userId);
}
