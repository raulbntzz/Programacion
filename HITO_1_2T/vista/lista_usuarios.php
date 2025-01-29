<?php
// Importamos el archivo de UsuariosController
require_once '../controlador/UsuariosController.php';
require_once '../config/conexion.php';
$conexion = new Conexion();
$controller = new UsuariosController();

// Obtiene la lista de usuarios y paquetes desde el controlador
$usuarios = $controller->listarUsuarios();
$packs = $controller->listarPack();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Estilos -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../estilos/estilos(lista).css">

    <title>Plataforma De Stream</title>
</head>
<body>
    <div class="container">
        <h1 class="text-center my-4">Tipos De Suscripciones</h1>

        <!-- Tabla de tipos de planes y paquetes -->
        <div class="table-container" style="display: flex; justify-content: center; gap: 100px;">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Tipo Plan</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                    <tr><td>Plan Básico</td><td>9,99€</td></tr>
                    <tr><td>Plan Estándar</td><td>13,99€</td></tr>
                    <tr><td>Plan Premium</td><td>17,99€</td></tr>
                </tbody>
            </table>
            
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Tipo Pack</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                    <tr><td>Deporte</td><td>6,99€</td></tr>
                    <tr><td>Cine</td><td>7,99€</td></tr>
                    <tr><td>Infantil</td><td>4,99€</td></tr>
                </tbody>
            </table>
        </div>

        <!-- Tabla de usuarios registrados -->
        <div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Correo</th>
                        <th>Edad</th>
                        <th>Paquetes Contratados</th>
                        <th>Tipo De Plan</th>
                        <th>Duración</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($usuarios as $usuario): ?>
                        <tr>
                            <td><?= $usuario['id'] ?></td>
                            <td><?= $usuario['nombre'] ?></td>
                            <td><?= $usuario['apellidos'] ?></td>
                            <td><?= $usuario['correo'] ?></td>
                            <td><?= $usuario['edad'] ?></td>
                            <td>
                                <?php 
                                    // Obtiene los paquetes contratados por el usuario
                                    $usuariofinal = $usuario['id'];
                                    $query = "SELECT paquete FROM suscripciones WHERE id_usuario = $usuariofinal";
                                    $resultado = $conexion->conexion->query($query);

                                    while ($fila = $resultado->fetch_assoc()) {
                                        echo $fila['paquete'] . ' ';
                                    }
                                ?>
                            </td>
                            <td><?= $usuario['plan_base'] ?></td>
                            <td><?= $usuario['duracion'] ?></td>
                            <td>
                                <a id="boton-gris" href="editar_usuario.php?id=<?= $usuario['id'] ?>" class="btn btn-sm">Editar</a>
                                <a id="boton-naranja" href="precio_usuario.php?id=<?= $usuario['id'] ?>" class="btn btn-sm">Factura</a>
                                <a href="eliminar_usuario.php?id=<?= $usuario['id'] ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>

        <!-- Botón para agregar un nuevo usuario -->
        <a href="alta_usuario.php" class="btn btn-success add-socio-btn">Agregar Nuevo Usuario</a>
    </div>
</body>
</html>
