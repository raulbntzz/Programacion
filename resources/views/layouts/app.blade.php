<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>AE_RBM - Gestión de Productos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../css/app.css">
</head>
<body>
    <header id ="cabezera">
        <h1>Aplicación AE_RBM</h1>
    </header>

    <main class="container my-4">
        @yield('content')
    </main>

    <footer>
        <small>&copy; {{ date('Y') }} AE_RBM</small>
    </footer>
</body>
</html>
