document.getElementById("formulario").addEventListener("submit", function(event) {
    
    // Evita el envío inmediato del formulario para realizar ciertos requisitos
    event.preventDefault();

    // Obtiene los valores ingresados en el formulario
    let edad = parseInt(document.getElementById("edad").value);
    let planSeleccionado = document.getElementById("plan_base").value;
    let duracion = document.getElementById("duracion").value;
    let paquetesSeleccionados = document.querySelectorAll("input[name='paquetes[]']:checked");

    // Realiza los requisitos
    if (edad < 18 && !document.querySelector("input[name='paquetes[]'][value='Infantil']").checked) {
        alert("Los usuarios menores de 18 años solo pueden contratar el Pack Infantil.");
        return;
    }

    if (planSeleccionado === "Basico" && paquetesSeleccionados.length > 1) {
        alert("Los usuarios del Plan Básico solo pueden seleccionar un paquete adicional.");
        return;
    }

    if (document.querySelector("input[name='paquetes[]'][value='Deporte']").checked && duracion !== "Anual") {
        alert("El Pack Deporte solo puede ser contratado si la duración es anual.");
        return;
    }

    // Si todas los requisitos son correctos, se envía el formulario
    event.target.submit();
});
