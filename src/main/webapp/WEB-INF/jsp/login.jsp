<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alke Wallet</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-md bg-body-tertiary"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand " href="index.html">Bienvenido a Alke
				Wallet </a>
		</div>
	</nav>
<section class="vh-100" style="background-color: #eee;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card shadow-2-strong" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <h3 class="mb-5">Inicio de sesión</h3>
			<form  action="/login" method="post">
	            <div data-mdb-input-init class="form-outline mb-4">
	              <input type="text" name="username" id="typeEmailX-2" class="form-control form-control-lg" />
	              <label class="form-label" for="typeEmailX-2">Usuario</label>
	            </div>
	
	            <div data-mdb-input-init class="form-outline mb-4">
	              <input type="password"name="password" id="typePasswordX-2" class="form-control form-control-lg" />
	              <label class="form-label" for="typePasswordX-2">Clave</label>
	            </div>
	
	
	            <button data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-lg btn-block" type="submit">Ingresar</button>
			</form>
			<a href="/form" class="btn btn-success btn-lg btn-block mt-3">No tienes una cuenta? Regístrate</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>