<?php
// Iniciamos la sesion
session_start();

// Vaciamos la sesion
session_unset();

// Borramos la sesion
session_destroy();

// Devolver al usuario al login
header("Location: login.php");
?>
