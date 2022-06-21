<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lista de coches</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>
<h1>Lista Fotos</h1>

<ul class="list-group">
  <c:forEach var="unaFoto" items="${listafotos}">
      <li class="list-group-item list-group-item-primary">Foto: ${unaFoto.descripcion}</li>
      <li class="list-group-item">Fecha: ${unaFoto.fecha}</li>
      <li class="list-group-item">Localización: ${unaFoto.localizacion}</li>
      <li class="list-group-item">Url: ${unaFoto.url}</li>
    <li></li>
  </c:forEach>
</ul>



</body>
</html>