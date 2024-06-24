<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="sec"  uri="http://www.springframework.org/security/tags"  %>    
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
    
<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org"
		xmlns:sec="http://www.springframework.org/extras/spring-security">
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body style="background-color: #eee;">
<nav class="navbar navbar-expand-md bg-body-tertiary"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand ">Alke Wallet </a>
		</div>
	</nav>

<section style="background-color: #eee;">
  <div class="container py-5">
    <div class="row">
      <div class="col">
        <nav aria-label="breadcrumb" class="bg-body-tertiary rounded-3 p-3 mb-4">
          <ol class="breadcrumb mb-0">
            <li class="breadcrumb-item"><a href="/home">Home</a></li>
          </ol>
        </nav>
      </div>
    </div>

    <div class="row " >
      <div class="col-lg-4">
        <div class="card mb-12">
          <div class="card-body text-center">
          <h1>Bienvenido</h1>
          <h3> ${user.nombre}</h3>
                        <h5>Saldo actual: ${user.saldo}</h5>         
          </div>
          	<ul>
            	<li> <a href ="<c:url value ="profile"/>" > Perfil</a></li>
            	<li> <a href ="<c:url value ="transaction/deposit"/>" > Depósito de dinero</a></li>
            	<li> <a href ="<c:url value ="transaction/withdraw"/>" > Retiro de dinero</a></li>
            	<li> <a href ="<c:url value ="transaction/transfer"/>" > Transferencia a otras cuentas</a></li>
            	<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li> <a href ="<c:url value ="/usuario/listado"/>" > Listado de Usuarios Registrados</a></li>
				</sec:authorize>
				<li> <a href ="<c:url value ="transaction/transactions"/>" > Historial de Transacciones</a></li>
				<li> <a href ="<c:url value ="/logout"/>" > Salir</a></li>
            </ul>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>