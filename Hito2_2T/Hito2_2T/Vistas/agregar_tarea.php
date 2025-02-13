<?php
// Si no está logeado, no dejar que acceda a ninguna pagina
session_start();
if ($_SESSION['usuario'] == '' || $_SESSION['password'] == ''){
    header('Location: login.php');
}

// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';

// Asegurar de que es de tipo POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller = new UsuariosController();

    // Añadir una tarea con los datos del formulario
    $controller->agregarTarea(
        $_GET['id'],
        $_POST['nombre'], 
        $_POST['descripcion'],
        $_POST['estado']
    );

    $id = $_GET['id'];
    $usuario = $controller->listarTarea();

    // Devolver al usuario a la lista de tareas
    header("Location: lista_tareas.php?id=" .$id);
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- Estilos y scripts -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Estilos/estilo_agregar.css">

    <title>Añadir Usuario</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Añadir Usuario</h1>

        <!-- Formulario de registro -->
        <form id="formulario" method="POST">
            <!-- Nombre -->
            <div class="mb-3">
                <label for="nombre" class="form-label">Tarea:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>

            <!-- Apellido -->
            <div class="mb-3">
                <label for="descripcion" class="form-label">Descripción:</label>
                <input type="text" class="form-control" id="descripcion" name="descripcion" required>
            </div>

            <!-- Estado de la tarea -->
            <label for="">Estado De La Tarea</label>
            <select id="estado" name="estado" class="form-select" required>
                <option value="Completado">Completado</option>
                <option value="Por Hacer">Por Hacer</option>
            </select>
            <br><br>
            <!-- Botón de envío -->
            <button type="submit" class="btn btn-success">Guardar</button>
        </form>
    </div>
</body>
</html>
