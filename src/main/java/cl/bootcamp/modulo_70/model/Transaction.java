package cl.bootcamp.modulo_70.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Transaction {
	private int id;
	private double retiro;
	private double deposito;
	private Timestamp fecha;
	private int usuario_id;
	private double saldo;

}
