<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <title>Alta usuario</title>
</head>
    <h1>${message}</h1>
        <c:forEach var="usuario" items="${listaUsuarios}">
            <div class="container">
                <ul>
                    <li><strong>Nombre:</strong> ${usuario.nombre}</li>
                    <li>Email: ${usuario.email}</li>
                    <li>Sobre mi: ${usuario.sobreMi}</li>
                    <li>Edad: ${usuario.edad}</li>
                    <li>Password: ${usuario.password}</li>
                </ul>
            </div>

        </c:forEach>