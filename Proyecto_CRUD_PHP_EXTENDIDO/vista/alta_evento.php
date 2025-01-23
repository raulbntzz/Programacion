<?php
require_once '../controlador/EventosController.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller = new EventosController();
    $controller->agregarEvento($_POST['nombre_evento'], $_POST['fecha'], $_POST['lugar']);
    header("Location: lista_eventos.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Añadir Socio</title>
    <style>
        body {
            background-color:rgb(99, 166, 233);
            font-family: Arial, sans-serif;
        }
        h1 {
            color: white;
        }
        label {
            color: white;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light text-center">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="lista_socios.php">Socios</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="lista_eventos.php">Eventos</a>
            </li>
        </ul>
    </div>
</nav>
    <div class="container mt-4">
        <h1>Añadir Evento</h1>
        <form method="POST">
            <div class="mb-3">
                <label for="nombre_evento" class="form-label">Nombre Del evento</label>
                <input type="text" class="form-control" id="nombre_evento" name="nombre_evento" required>
            </div>
            <div class="mb-3">
                <label for="fecha" class="form-label">Fecha</label>
                <input type="date" class="form-control" id="fecha" name="fecha" required>
            </div>
            <div class="mb-3">
                <label for="lugar" class="form-label">Lugar</label>
                <input type="text" class="form-control" id="lugar" name="lugar" required>
            </div>
            <button type="submit" class="btn btn-success">Guardar</button>
        </form>
    </div>
</body>
</html>

