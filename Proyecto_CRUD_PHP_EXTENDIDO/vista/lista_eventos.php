<?php
require_once '../controlador/EventosController.php';
$controller = new EventosController();
$eventos = $controller->listarEvento();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <title>Listado de Socios</title>
    <style>
        body {
            background-color:rgb(99, 166, 233);
            font-family: Arial, sans-serif;
        }
        h1 {
            color: white;
        }
        .table-container {
            margin: 2rem auto;
            max-width: 90%;
            padding: 1.5rem;
        }
        .table th {
            background-color: rgb(99, 166, 233);
            color:rgb(255, 255, 255);
            text-align: center;
        }
        .table td {
            text-align: center;
        }
        .btn {
            margin: 0 0.2rem;
            color: white;
        }
        .add-socio-btn {
            display: block;
            width: fit-content;
            margin: 1rem auto;
        }
        #boton-azul {
            background-color: rgb(99, 166, 233);
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

    <div class="container">
        <h1 class="text-center my-4">Eventos Registrados</h1>
        <div class="table-container">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Del Evento</th>
                        <th>Fecha</th>
                        <th>Lugar</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($eventos as $evento): ?>
                        <tr>
                            <td><?= $evento['id_evento'] ?></td>
                            <td><?= $evento['nombre_evento'] ?></td>
                            <td><?= $evento['lugar'] ?></td>
                            <td><?= $evento['fecha'] ?></td>
                            <td>
                                <a id="boton-azul" href="editar_evento.php?id=<?= $evento['id_evento'] ?>" class="btn btn-sm">Editar</a>
                                <a href="eliminar_evento.php?id=<?= $evento['id_evento'] ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
        <a href="alta_evento.php" class="btn btn-success add-socio-btn">Agregar un nuevo evento</a>
    </div>
</body>
</html>
