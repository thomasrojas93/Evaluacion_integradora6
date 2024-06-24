create schema datos;
 use datos;

create table usuario(
usuario_id int auto_increment primary key,
username varchar (100) not null,
password varchar (100),
nombre varchar (100),
apellido varchar (100),
email varchar (100),
rol varchar(100),
saldo Double not null
);

CREATE TABLE transaction_entity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    to_user_id INT,
    amount DOUBLE,
    type VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES usuario(usuario_id),
    FOREIGN KEY (to_user_id) REFERENCES usuario(usuario_id)
);
select * from usuario;

select * from transaction_entity;
drop table usuario;
drop table transacciones;

insert into usuario (username, password,nombre,apellido,email,rol,saldo) values
('pepe',1234,'pepito','perez','pp@gmail.com','ADMIN',5000),
('pato',1234,'patricio','rojas','pr@gmail.com','ADMIN',5000)
;
