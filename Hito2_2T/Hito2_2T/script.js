// Función para confirmar la eliminación de una tarea
function confirmarEliminacion(id) {
    // Muestra un cuadro de confirmación
    let confirmacion = confirm("¿Estás seguro de que quieres eliminar esta tarea?");
    
    // Si el usuario confirma, elimina la tarea
    if (confirmacion) {
        window.location.href = "eliminar_tarea.php?id=" + id;
    }
}
