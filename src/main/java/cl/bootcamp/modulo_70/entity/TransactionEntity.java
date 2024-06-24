package cl.bootcamp.modulo_70.entity;

import java.sql.Timestamp;
import java.util.Date;

import enums.TransactionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="transaction_entity")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsuarioEntity user;

    @ManyToOne
    @JoinColumn(name = "to_user_id", nullable = true)
    private UsuarioEntity toUser;

    private double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UsuarioEntity getUsuario() {
		return user;
	}

	public void setUsuario(UsuarioEntity user) {
		this.user = user;
	}

	public UsuarioEntity getToUsuario() {
		return toUser;
	}

	public void setToUsuario(UsuarioEntity toUser) {
		this.toUser = toUser;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

    // Getters and Setters
    
}
//@Entity
//@Data
//@Table(name="transacciones")
//public class TransactionEntity {
//	
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//    
//    @Column(name = "usuario_id")
//    private UsuarioEntity usuario;
//    
//    @Column(name = "retiro")
//    private double retiro;
//
//    @Column(name = "deposito")
//    private double deposito;
//    
//    @Column(name = "monto")
//    private double monto;
//    
//   
//    @Column(name="fecha")
//	private Timestamp transactionDate;
//
//}
