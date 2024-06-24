<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Transferencia</title>
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
    <h2>Transferir dinero</h2>
    <form action="transfer" method="post">
        <label for="fromUserId">ID usuario de origen:</label>
        <input type="text" id="fromUserId" name="fromUserId">
        <br>
        <br>
        <label for="toUserId">ID usuario destinatario:</label>
        <input type="text" id="toUserId" name="toUserId">
        <br>
        <br>
        <label for="amount">Monto:</label>
        <input type="text" id="amount" name="amount">
        <br>
        <br>
        <input class= "btn btn-info" type="submit" value="Transfer">
    </form>
    <div>
        <p style="color:green;">${success}</p>
        <p style="color:red;">${error}</p>
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
/html>