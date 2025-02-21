<?php
// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';

// Asegurar de que es de tipo POST
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $puerto = '1234';
    $url = "http://localhost:$puerto/v1/chat/completions";

    $datos = array(
        "model"=> "llama-3.2-1b-instruct",
        "messages"=> 
        array(
            array("role"=> "system", "content"=> "Responde siempre en español. RESPONDE SOLO SI SON RECETAS DE COMIDA Y NO SALUDES NI ME DES UNA INTRODUCCIÓN"),
            array("role"=> "user", "content"=> "Dame la receta de: " .$_POST['nombre'])
        ),
        "temperature"=> 0.5,
        "max_tokens"=> -1,
        "stream"=> false
    );

    $jsonDatos = json_encode($datos);

    $ch = curl_init($url);

    curl_setopt($ch, CURLOPT_POST, true);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($ch, CURLOPT_POSTFIELDS, $jsonDatos);

    curl_setopt($ch, CURLOPT_HTTPHEADER, array(
        'Content-Type: application/json',
        'Content-Length: ' . strlen($jsonDatos)
    ));

    $respuesta = curl_exec($ch);

    if (curl_errno($ch)) {
        echo 'Error en cURL: ' . curl_error($ch);
    } else {
        $data = json_decode($respuesta, true);

        $message = $data['choices'][0]['message']['content'];

        $controller = new UsuariosController();
        $nombre_receta = $_POST['nombre'];
        // Obtiene la lista de tareas
        $recetas = $controller->agregarReceta($nombre_receta, $message);
    }
    curl_close($ch);
    header("Location: inicio.php");
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

    <title>Añadir Receta</title>
</head>
<body>
    <div class="container mt-4">
        <h1>Añadir Receta</h1>

        <!-- Formulario de registro -->
        <form id="formulario" method="POST">
            <!-- Nombre -->
            <div class="mb-3">
                <label for="nombre" class="form-label">Receta:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            <!-- Botón de envío -->
            <button type="submit" class="btn btn-success">Guardar</button>
        </form>
    </div>
</body>
</html>