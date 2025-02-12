<?php
// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';
$controller = new UsuariosController();

// Obtiene la lista de usuarios y paquetes desde el controlador
$usuarios = $controller->listarTareaPorID($_GET['id']);
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Estilos -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Estilos/estilos_lista.css">

    <title>Tareas</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand">Gestor de Tareas</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="logout.php">Cerrar Sesión</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <h1 class="text-center my-4">Tareas</h1>
        <!-- Tabla de usuarios registrados -->
        <div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($usuarios as $usuario): ?>
                        <tr>
                            <td><?= $usuario['id'] ?></td>
                            <td><?= $usuario['nombre'] ?></td>
                            <td><?= $usuario['descripcion'] ?></td>
                            <td><?= $usuario['estado'] ?></td>
                            <td>
                                <a id="boton-gris" href="editar_tarea.php?id=<?= $usuario['id'] ?>" class="btn btn-sm">Editar</a>
                                <a href="eliminar_tarea.php?id=<?= $usuario['id'] ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>

        <!-- Botón para agregar un nuevo usuario -->
        <a href="agregar_tarea.php?id=<?= $_GET['id'] ?>" class="btn btn-success add-socio-btn">Agregar Nuevo Usuario</a>
    </div>
</body>
</html>
