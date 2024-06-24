package cl.bootcamp.modulo_70.service;

import java.util.List;

import cl.bootcamp.modulo_70.entity.TransactionEntity;

public interface TransactionService {
	TransactionEntity deposit(int id, double amount);
    TransactionEntity withdraw(int id, double amount);
    TransactionEntity transfer(int id, int toUserId, double amount);
    List<TransactionEntity> findAllTransactionsByUserId(int userId);
}
