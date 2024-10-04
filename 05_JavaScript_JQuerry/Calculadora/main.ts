const rangeInput = document.getElementById('theme-range') as HTMLInputElement | null;
const root = document.documentElement;

if (rangeInput) {
    rangeInput.addEventListener('input', () => {
        root.classList.remove('second-theme', 'third-theme');

        switch (rangeInput.value) {
            case '1':
                break;
            case '2':
                root.classList.add('second-theme');
                break;
            case '3':
                root.classList.add('third-theme');
                break;
        }
    });
}
