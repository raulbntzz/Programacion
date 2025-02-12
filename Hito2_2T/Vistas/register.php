<?php
// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';

// Asegurar de que es de tipo POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller = new UsuariosController();

    // Añadir un usuario con los datos del formulario
    $controller->registrarUsuario(
        $_POST['usuario'], 
        $_POST['email'], 
        $_POST['password']
    );

    session_start();
    session_unset();
    session_destroy();
    // Envía a la lista de usuarios tras agregar el usuario
    header("Location: login.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../Estilos/estilo_register.css">
    <title>Registrar</title>
</head>
<body>
    <div class="container">
        <h2>Registrar Usuario</h2>
        <form method="post">
            <br>
            <label for="usuario">Usuario:</label>
            <input type="text" id="usuario" name="usuario" required>

            <label for="email">Correo:</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password" required>

            <input type="submit" value="Registrar">
            <a href="login.php" type="submit">Tienes cuenta? Inicia Sesión</a>
        </form>
    </div>
</body>
</html>
