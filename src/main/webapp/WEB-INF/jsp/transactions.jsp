
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Historial de Transacciones</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h2>Historial de Transacciones</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>ID de Usuario</th>
                    <th>ID de Usuario Destino</th>
                    <th>Monto</th>
                    <th>Tipo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${transactions}" var="transaction">
                    <tr>
                        <td>${transaction.id}</td>
                        <td>${transaction.user.id}</td>
                        <td>${transaction.toUser != null ? transaction.toUser.id : 'N/A'}</td>
                        <td>${transaction.amount}</td>
                        <td>${transaction.type}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>