<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Depósito de dinero</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-md bg-body-tertiary"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand ">Alke Wallet </a>
		</div>
	</nav>
	<section class="vh-100" style="background-color: #b7dbfb;">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card shadow-2-strong" style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">
							<h2>Deposito de fondos</h2>
							<br> <br>
							<form action="deposit" method="post">
								<label for="userId">ID Usuario:</label> <input type="text"
									id="userId" name="userId"> <br> <br> <label
									for="amount">Monto:</label> <input type="text" id="amount"
									name="amount"> <br> <br> <input
									class="btn btn-success" type="submit" value="Deposit">
							</form>
							<div>
								<p style="color: green;">${success}</p>
								<p style="color: red;">${error}</p>
							</div>
							<div class="row">
								<div class="col">
									<nav aria-label="breadcrumb"
										class="bg-body-tertiary rounded-3 p-3 mb-4">
										<ol class="breadcrumb mb-0">
											<li class="breadcrumb-item"><a href="/home">Volver al Home</a></li>
										</ol>
									</nav>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
