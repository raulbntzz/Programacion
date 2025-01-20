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
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .table-container {
            margin: 2rem auto;
            max-width: 90%;
            background: #ffffff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            padding: 1.5rem;
        }
        .table th {
            background-color: #6c757d;
            color: #ffffff;
            text-align: center;
        }
        .table td {
            text-align: center;
        }
        .btn {
            margin: 0 0.2rem;
        }
        .add-socio-btn {
            display: block;
            width: fit-content;
            margin: 1rem auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center my-4">Socios Registrados</h1>
        <div class="table-container">
            <table class="table table-hover table-bordered">
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
                                <a href="editar_socio.php?id=<?= $socio['id_socio'] ?>" class="btn btn-warning btn-sm">Editar</a>
                                <a href="eliminar_socio.php?id=<?= $socio['id_socio'] ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
        <a href="alta_socio.php" class="btn btn-success add-socio-btn">Agregar un nuevo socio</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
