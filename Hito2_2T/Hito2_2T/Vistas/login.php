<?php
// Iniciamos la sesion
session_start();

// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';
$error = '';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $controller = new UsuariosController();
    
    $correo = $_POST['email'];
    $passwordIngresada = $_POST['password'];

    // Obtener los datos del usuario desde la base de datos
    $usuario = $controller->obtenerContraseñaPorId($correo);

    if ($usuario) {
        if (password_verify($passwordIngresada, $usuario['password'])) {
            $_SESSION['usuario'] = $usuario['nombre'];
            $_SESSION['password'] = $_POST['password'];
            header("Location: lista_tareas.php?id=" .$usuario['id']);
            exit;
        } else {
            $error = "Usuario o contraseña incorrecto.";
        }
    } else {
        $error = "Usuario no encontrado.";
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../Estilos/estilo_login.css">
    <title>Iniciar Sesión</title>
</head>
<body>
    <div class="container">
        <h2>Iniciar Sesión</h2>
        <form method="post">
            <h3><?php echo $error;?></h3>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password" required>
            
            <br><br>
            <input type="submit" value="Iniciar Sesión">
            <br><br>
            <a href="register.php" type="submit">No tienes cuenta? Regístrate</a>
        </form>
    </div>
</body>
</html>
