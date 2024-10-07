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

const pantalla = document.querySelector('.resultat') as HTMLElement;

pantalla.textContent = "0";

const buttons = document.querySelectorAll('.button');

let currentInput: string = "";

buttons.forEach(button => {
    button.addEventListener('click', () => {
        const buttonValue = (button as HTMLElement).textContent || "";

        if (button.id === 'reset') {
            currentInput = "";
            pantalla.textContent = "0";
        }
        else if (button.id === 'delete') {
            currentInput = currentInput.slice(0, -1);
            pantalla.textContent = currentInput || "0";
        }
        else if (button.id === 'igual') {
            try {
                currentInput = eval(currentInput.replace('x', '*'));
                pantalla.textContent = currentInput.toString();
            } catch (error) {
                pantalla.textContent = "Error";
                currentInput = "";
            }
        }
        else {
            if (pantalla.textContent === "0" && !isNaN(Number(buttonValue))) {
                currentInput = buttonValue;
            } else {
                currentInput += buttonValue;
            }
            pantalla.textContent = currentInput;
        }
    });
});
