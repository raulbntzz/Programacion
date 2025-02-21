<?php
// Importamos el archivo de UsuariosController
require_once '../controlador/UsuariosController.php';

$controller = new UsuariosController();
$receta = $controller->listarRecetasPorID($_GET['id']);

// Asegurar de que es de tipo GET
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller->actualizarReceta(
        $_GET['id'],
        $_POST['nombre'],
        $_POST['descripcion']
    );

    // Devolver al usuario a la lista de tareas
    header("Location: inicio.php");
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

    <title>Editar Receta</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Editar Receta</h1>

        <!-- Editar estado de la tarea -->
        <form method="POST">
        <label for="">Nombre</label>
            <div class="mb-3">
                <input type="text" class="form-control" id="nombre" name="nombre" value="<?php echo $receta['nombre_receta'] ?>">
            </div>
        
        <label for="">Descripción</label>
            <div class="mb-3">
                <textarea class="form-control" id="descripcion" name="descripcion" rows="4"><?php echo $receta['descripcion_receta']; ?></textarea>
            </div>

            <br>
            <!-- Botón de envío -->
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </div>
</body>
</html>
