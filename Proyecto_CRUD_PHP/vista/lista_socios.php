<?php
require_once '../controlador/SociosController.php';
$controller = new SociosController();
$socios = $controller->listarSocios();
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
    <div class="container">
        <h1 class="text-center my-4">Socios Registrados</h1>
        <div class="table-container">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Email</th>
                        <th>Teléfono</th>
                        <th>Fecha de Nacimiento</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($socios as $socio): ?>
                        <tr>
                            <td><?= $socio['id_socio'] ?></td>
                            <td><?= $socio['nombre'] ?></td>
                            <td><?= $socio['apellido'] ?></td>
                            <td><?= $socio['email'] ?></td>
                            <td><?= $socio['telefono'] ?></td>
                            <td><?= $socio['fecha_nacimiento'] ?></td>
                            <td>
                                <a id="boton-azul" href="editar_socio.php?id=<?= $socio['id_socio'] ?>" class="btn btn-sm">Editar</a>
                                <a href="eliminar_socio.php?id=<?= $socio['id_socio'] ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
        <a href="alta_socio.php" class="btn btn-success add-socio-btn">Agregar un nuevo socio</a>
    </div>
</body>
</html>
