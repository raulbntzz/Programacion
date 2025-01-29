<?php
// Importamos el archivo de UsuariosController
require_once '../controlador/UsuariosController.php';
require_once '../config/conexion.php';
$conexion = new Conexion();
$controller = new UsuariosController();

// Obtenemos el ID del usuario desde la URL
$id_usuario = $_GET['id'];

// Obtenemos los datos del usuario con el ID
$usuarios = $controller->obtenerUsuarioPorId($id_usuario);

// Consulta para obtener los paquetes del usuario
$query = "SELECT paquete, precio FROM suscripciones WHERE id_usuario = $id_usuario";
$resultado = $conexion->conexion->query($query);

// Mostrar los paquetes del usuario
$paquetes = [];
while ($fila = $resultado->fetch_assoc()) {
    $paquetes[] = $fila;
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Estilos -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../estilos/estilos(lista).css">

    <title>Plataforma De Stream - Facturas</title>
</head>
<body>
    <div class="container">
        <h1 class="text-center my-4">Facturas</h1>
        
        <!-- Tabla de información del usuario -->
        <div class="table-container mb-4">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Correo</th>
                        <th>Edad</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><?= $usuarios['id'] ?></td>
                        <td><?= $usuarios['nombre'] ?></td>
                        <td><?= $usuarios['apellidos'] ?></td>
                        <td><?= $usuarios['correo'] ?></td>
                        <td><?= $usuarios['edad'] ?></td>
                    </tr>
                </tbody>
            </table>
        </div>

        <!-- Tabla de paquetes contratados -->
        <div class="table-container mb-4">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Paquete Contratado</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody id="paquetes-list">
                    <?php foreach ($paquetes as $paquete): ?>
                        <tr>
                            <td><?= $paquete['paquete'] ?></td>
                            <td><?= number_format($paquete['precio'], 2) ?>€</td>
                        </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>

        <!-- Precio del plan -->
        <h1 class="text-center">Precio del Plan: 
            <span id="plan-base-cost" class="text"></span>
        </h1>

        <!-- Total a pagar -->
        <h1 id="total-cost" class="text-center"></h1>
        
        <!-- Botón para volver a la lista de usuarios -->
        <a href="lista_usuarios.php" class="btn btn-primary add-socio-btn">Volver</a>
    </div>

    <!-- Cálculos en JavaScript -->
    <script>
        const paquetes = <?= json_encode($paquetes) ?>;
        const planBase = "<?= $usuarios['plan_base'] ?>";
    </script>

    <!-- Calcular precios -->
    <script src="../calculos.js"></script>
</body>
</html>
