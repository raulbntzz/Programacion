// Ruta del archivo JSON
const jsonUrl = '../ej1.json';

// Función para cargar datos desde el JSON
fetch(jsonUrl)
  .then(response => {
    if (!response.ok) {
      throw new Error('Error al cargar el archivo JSON');
    }
    console.log('JSON cargado con éxito');
    return response.json();
  })
  .then(data => {
    console.log('Datos obtenidos:', data); // Verifica si los datos se cargan correctamente
    displayRecipes(data);
  })
  .catch(error => {
    console.error('Error:', error);
  });

  function displayRecipes(data) {
    const container = document.getElementById('card-container');
  
    data.forEach(recipe => {
      const card = document.createElement('div');
      card.className = 'col-md-4';
  
      card.innerHTML = `
        <div class="card mb-4 shadow-sm">
          <img src="${recipe.imagen}" class="card-img-top" alt="${recipe.nombre}" style='width: 100%; padding: 3.5%;'>
          <div class="card-body">
            <h5 class="card-title" style='text-align: center;'>${recipe.nombre}</h5>
            <p class="card-text">${recipe.descripcion}</p>
          </div>
        </div>
      `;
  
      container.appendChild(card);
    });
  }
