package cl.bootcamp.modulo_70.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.bootcamp.modulo_70.entity.TransactionEntity;
import cl.bootcamp.modulo_70.entity.UsuarioEntity;
import cl.bootcamp.modulo_70.repository.TransactionRepository;
import cl.bootcamp.modulo_70.repository.UsuarioRepository;
import cl.bootcamp.modulo_70.service.TransactionService;
import enums.TransactionType;


@Service
public class TransactionServiceImpl implements TransactionService {

	
	@Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Override
	@Transactional
	public TransactionEntity deposit(int id, double amount) {
	 Optional<UsuarioEntity> optionalUser = usuarioRepository.findById(id);
	        if (optionalUser.isPresent()) {
	            UsuarioEntity user = optionalUser.get();
	            usuarioRepository.updateSaldo(id, amount);  // Añade el monto al saldo del user
	            TransactionEntity transaction = new TransactionEntity();
	            transaction.setUsuario(user);
	            transaction.setAmount(amount);
	            transaction.setType(TransactionType.DEPOSIT);
	            transactionRepository.save(transaction);  // Guarda la transacción
	            return transaction;
	        }
	        throw new IllegalArgumentException("user no encontrado");
	}

	@Override
	public TransactionEntity withdraw(int id, double amount) {
		 Optional<UsuarioEntity> optionalUser = usuarioRepository.findById(id);
	        if (optionalUser.isPresent()) {
	            UsuarioEntity user = optionalUser.get();
	            if (user.getSaldo() < amount) {
	                throw new IllegalArgumentException("Saldo insuficiente");
	            }
	            usuarioRepository.updateSaldo(id, -amount);  // Resta el monto del saldo del user
	            TransactionEntity transaction = new TransactionEntity();
	            transaction.setUsuario(user);
	            transaction.setAmount(-amount);
	            transaction.setType(TransactionType.WITHDRAW);
	            transactionRepository.save(transaction);  // Guarda la transacción
	            return transaction;
	        }
	        throw new IllegalArgumentException("user no encontrado");
	}

	@Override
	public TransactionEntity transfer(int id, int toUserId, double amount) {
		  Optional<UsuarioEntity> fromUserOptional = usuarioRepository.findById(id);
	        Optional<UsuarioEntity> toUserOptional = usuarioRepository.findById(toUserId);

	        if (fromUserOptional.isPresent() && toUserOptional.isPresent()) {
	            UsuarioEntity fromUser = fromUserOptional.get();
	            UsuarioEntity toUser = toUserOptional.get();

	            if (fromUser.getSaldo() < amount) {
	                throw new IllegalArgumentException("Saldo insuficiente");
	            }

	            usuarioRepository.updateSaldo(id, -amount);  // Resta el monto del saldo del user origen
	            usuarioRepository.updateSaldo(toUserId, amount);  // Añade el monto al saldo del user destino

	            TransactionEntity transaction = new TransactionEntity();
	            transaction.setUsuario(fromUser);
	            transaction.setToUsuario(toUser);
	            transaction.setAmount(amount);
	            transaction.setType(TransactionType.TRANSFER);
	            transactionRepository.save(transaction);  // Guarda la transacción

	            return transaction;
	        }
	        throw new IllegalArgumentException("user(s) no encontrado(s)");
	}
	 @Override
	    public List<TransactionEntity> findAllTransactionsByUserId(int userId) {
	        return transactionRepository.findByUserId(userId);
	    }
	 
}
