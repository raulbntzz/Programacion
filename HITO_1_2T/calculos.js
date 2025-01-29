document.addEventListener('DOMContentLoaded', () => {
    const totalCostDiv = document.getElementById('total-cost');
    const planBaseCostDiv = document.getElementById('plan-base-cost');

    // Precios de los planes
    const preciosPlanBase = {
        Basico: 9.99,
        Estandar: 13.99,
        Premium: 17.99
    };

    // Precios de los paquetes
    const preciosPaquetes = {
        Deporte: 6.99,
        Cine: 7.99,
        Infantil: 4.99
    };

    const calcularTotal = () => {
        let total = 0;

        // Precio del plan
        const planBaseCost = preciosPlanBase[planBase] || 0;
        total += planBaseCost;
        planBaseCostDiv.textContent = `${planBaseCost.toFixed(2)}€`;

        // Sumar precios de los paquetes
        paquetes.forEach(paquete => {
            const precioPaquete = preciosPaquetes[paquete.paquete] || parseFloat(paquete.precio);
            total += precioPaquete;
        });

        // Mostrar el total
        totalCostDiv.textContent = `Precio total: ${total.toFixed(2)}€`;
    };

    calcularTotal();
});
