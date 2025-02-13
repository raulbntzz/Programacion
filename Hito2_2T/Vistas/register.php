<?php
// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';
$error = '';

// Asegurar de que es de tipo POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller = new UsuariosController();
    $usuario = $controller->obtenerCorreoPorCorreo($_POST['email']);

    // Añadir un usuario con los datos del formulario
    if ($_POST['email'] == $usuario['correo']) {
        $error = 'El correo ya está en uso, porfavor, pruebe con otro distinto';
    }   else {
        $controller->registrarUsuario(
            $_POST['usuario'], 
            $_POST['email'], 
            $_POST['password']
        );

        // Devolver al usuario a la lista de tareas
        header("Location: login.php");
        exit();
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../Estilos/estilo_login.css">
    <title>Registrar</title>
</head>
<body>
    <div class="container">
        <h2>Registrar Usuario</h2>
        <form method="post">
            <h3><?php echo $error;?></h3>
            <label for="usuario">Usuario:</label>
            <input type="text" id="usuario" name="usuario" required>

            <label for="email">Correo:</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password" required>

            <label>
                <input type="checkbox" required>
                Acepto las políticas de privacidad
            </label>
            
            <br><br>
            <input type="submit" value="Registrar">
            <br><br>
            <a href="login.php" type="submit">Tienes cuenta? Inicia Sesión</a>
        </form>
    </div>
</body>
</html>
