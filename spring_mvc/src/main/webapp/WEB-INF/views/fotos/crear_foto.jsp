<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Crear foto</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>
<h1>Crear foto</h1>
<p>${error}</p>

  <form action="" method="POST">
    <div><input type="text" placeholder="Descripcion" name="descripcion" value="${unaFoto.descripcion}"></div>
    <div><input type="date" placeholder="fecha" name="fecha"></div>
    <div><input type="text" placeholder="Localizacion" name="localizacion" value="${unaFoto.localizacion}"></div>
    <div><input type="text" placeholder="Url" name="url" value="${unaFoto.url}"></div>
    <br>
    <button class="btn btn-primary">Add foto</button>
  </form>

</body>
</html>