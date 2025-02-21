<?php
require_once '../Controlador/UsuariosController.php';
$controller = new UsuariosController();

// Obtiene la lista de tareas
$recetas = $controller->listarRecetas();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Estilos -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Estilos/estilo_lista.css">
    <script src="../script.js"></script>


    <title>Tareas</title>
</head>
<body>
<div class="container">
    <h1 class="text-center my-4">Recetas</h1>
    <div class="container">
        <div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th colspan="2">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($recetas as $receta): ?>
                        <tr>
                            <td><?= $receta['nombre_receta'] ?></td>
                            <td><?= $receta['descripcion_receta'] ?></td>
                            <td>
                                <a id="boton-amarillo" href="editar_receta.php?id=<?= $receta['id'] ?>" class="btn btn-sm">Editar</a>
                            </td>
                            <td>
                                <a href="eliminar_receta.php?id=<?= $receta['id'] ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
            <a href="agregar_receta.php?" class="btn add-socio-btn">Agregar Receta</a>
        </div>

        <div class="container mt-5">
            <h1 class="text-center mb-4">Recetas Deliciosas 🍽️</h1>
            <div id="card-container" class="row"></div>
        </div>
    </div>
</body>
</html>
