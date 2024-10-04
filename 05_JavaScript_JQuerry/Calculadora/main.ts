// Obtenemos el slider y el root de CSS
const rangeInput = document.getElementById('theme-range') as HTMLInputElement | null;
const root = document.documentElement; // El root representa ":root" en CSS

if (rangeInput) {
    rangeInput.addEventListener('input', () => {
        // Limpiar clases de tema
        root.classList.remove('second-theme', 'third-theme');

        // Cambiar tema según el valor del slider
        switch (rangeInput.value) {
            case '1':
                // Tema por defecto (no se aplica clase adicional)
                break;
            case '2':
                // Aplicar el segundo tema
                root.classList.add('second-theme');
                break;
            case '3':
                // Aplicar el tercer tema
                root.classList.add('third-theme');
                break;
        }
    });
}
