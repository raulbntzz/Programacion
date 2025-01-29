<?php
// Importamos el archivo de UsuariosController
require_once '../controlador/UsuariosController.php';

// Asegurar de que es de tipo POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $controller = new UsuariosController();

    // Añadir un usuario con los datos del formulario
    $controller->agregarUsuario(
        $_POST['nombre'], 
        $_POST['apellido'], 
        $_POST['email'], 
        $_POST['edad'], 
        $_POST['plan_base'],
        $_POST['duracion'],
        $_POST['paquetes']
    );

    // Envía a la lista de usuarios tras agregar el usuario
    header("Location: lista_usuarios.php");
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
    <link rel="stylesheet" href="../estilos/estilos(alta).css">
    <script src="../script.js" defer></script>

    <title>Añadir Usuario</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Añadir Usuario</h1>

        <!-- Formulario de registro -->
        <form id="formulario" method="POST">
            <!-- Nombre -->
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>

            <!-- Apellido -->
            <div class="mb-3">
                <label for="apellido" class="form-label">Apellido</label>
                <input type="text" class="form-control" id="apellido" name="apellido" required>
            </div>

            <!-- Email -->
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>

            <!-- Edad -->
            <div class="mb-3">
                <label for="edad" class="form-label">Edad</label>
                <input type="number" class="form-control" id="edad" name="edad" min="1" max="100" required>
            </div>

            <!-- Tipo de plan y duración -->
            <div class="row mb-3">
                <div class="col-md-3">
                    <legend class="form-label">Tipo De Plan:</legend>
                </div>
                <div class="col-md-9 d-flex align-items-center gap-2">
                    <select id="plan_base" name="plan_base" class="form-select" required>
                        <option value="Basico">Básico</option>
                        <option value="Estandar">Estándar</option>
                        <option value="Premium">Premium</option>
                    </select>
                    <select id="duracion" name="duracion" class="form-select" required>
                        <option value="Mensual">Mensual</option>
                        <option value="Anual">Anual</option>
                    </select>
                </div>
            </div>

            <!-- Paquetes adicionales -->
            <div class="row mb-3">
                <div class="col-md-3">
                    <legend class="form-label">Paquetes Adicionales:</legend>
                </div>
                <div class="col-md-9 d-flex align-items-center gap-3">
                    <label class="form-check-label">
                        <input type="checkbox" name="paquetes[]" value="Deporte" class="form-check-input"> Deporte
                    </label>
                    <label class="form-check-label">
                        <input type="checkbox" name="paquetes[]" value="Cine" class="form-check-input"> Cine
                    </label>
                    <label class="form-check-label">
                        <input type="checkbox" name="paquetes[]" value="Infantil" class="form-check-input"> Infantil
                    </label>
                </div>
            </div>

            <!-- Botón de envío -->
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </div>
</body>
</html>
