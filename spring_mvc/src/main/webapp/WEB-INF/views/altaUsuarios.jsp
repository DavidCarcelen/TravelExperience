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
<body>
<h1>${mensaje}</h1>
  <div class="container form-group">
        <div>
            <p>${error}</p>
        </div>
  <form action="" method = "POST">
    <div class="form-group">
      <label for="nombre">Nombre:</label>
      <input type="text" class="form-control" name="nombre" placeholder="Escriba su nombre" value="${unUsuario.nombre}">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control"name="email" placeholder="ejemplo@ejemplo.com" value="${unUsuario.email}">
    </div>
    <div class="form-group">
      <label for="sobreMi">Sobre mi:</label>
      <input type="text" class="form-control" name="sobreMi" placeholder="Escribe breve descripcion" value="${unUsuario.sobreMi}">
    </div>
    <div class="form-group">
      <label for="edad">Edad:</label>
      <input type="number" class="form-control" name="edad" placeholder="Introduce tu edad" value="${unUsuario.edad}">
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" name="password" placeholder="El password debe tener minimo 5 caracteres" value="${unUsuario.password}">
    </div><br>
    <button type="submit" class="btn btn-danger">Alta Usuario</button>
  </form>
</div>  
</body>
</html>