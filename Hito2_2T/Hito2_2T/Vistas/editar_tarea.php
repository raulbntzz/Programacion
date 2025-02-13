<?php
// Si no está logeado, no dejar que acceda a ninguna pagina
session_start();
if ($_SESSION['usuario'] == '' || $_SESSION['password'] == ''){
    header('Location: login.php');
}

// Importamos el archivo de UsuariosController
require_once '../controlador/UsuariosController.php';

// Asegurar de que es de tipo POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller = new UsuariosController();

    // Editar una tarea con los datos del formulario
    $controller->actualizarTarea(
        $_POST['estado'],
        $id = $_GET['id']
    );

    $usuario = $controller->obtenerID($_GET['id']);

    // Devolver al usuario a la lista de tareas
    header("Location: lista_tareas.php?id=" .$usuario['id_usuario']);
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Estilos -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../Estilos/estilo_agregar.css">

    <title>Editar Tarea</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar Tarea</h1>

        <!-- Editar estado de la tarea -->
        <form method="POST">
        <label for="">Estado De La Tarea</label>
            <select id="estado" name="estado" class="form-select" required>
                <option value="Completado">Completado</option>
                <option value="Por Hacer">Por Hacer</option>
            </select>
            <br>
            <!-- Botón de envío -->
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </div>
</body>
</html>
