const slider = document.querySelector('.slider') as HTMLElement;
const ball = document.querySelector('.ball') as HTMLElement;

let currentPosition = 0; // 0 para la izquierda, 1 para el centro, 2 para la derecha

slider.addEventListener('click', (event) => {
    const sliderWidth = slider.offsetWidth;
    const clickPosition = event.offsetX; // Posición del clic

    // Calcular la posición en base a donde se hizo clic
    if (clickPosition < sliderWidth / 3) {
        currentPosition = 0; // Mover a la izquierda
    } else if (clickPosition < (sliderWidth * 2) / 3) {
        currentPosition = 1; // Mover al centro
    } else {
        currentPosition = 2; // Mover a la derecha
    }

    // Aplicar la clase correspondiente para mover la bola
    ball.className = 'ball'; // Resetear las clases
    ball.classList.add(`position-${currentPosition}`);
});
