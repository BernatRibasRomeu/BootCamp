var slider = document.querySelector('.slider');
var ball = document.querySelector('.ball');
var currentPosition = 0; // 0 para la izquierda, 1 para el centro, 2 para la derecha
slider.addEventListener('click', function (event) {
    var sliderWidth = slider.offsetWidth;
    var clickPosition = event.offsetX; // Posición del clic
    // Calcular la posición en base a donde se hizo clic
    if (clickPosition < sliderWidth / 3) {
        currentPosition = 0; // Mover a la izquierda
    }
    else if (clickPosition < (sliderWidth * 2) / 3) {
        currentPosition = 1; // Mover al centro
    }
    else {
        currentPosition = 2; // Mover a la derecha
    }
    // Aplicar la clase correspondiente para mover la bola
    ball.className = 'ball'; // Resetear las clases
    ball.classList.add("position-".concat(currentPosition));
});
