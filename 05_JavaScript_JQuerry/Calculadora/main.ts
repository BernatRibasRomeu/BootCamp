const pantalla = document.getElementById('pantalla') as HTMLElement;
let currentInput: string = '';
let previousInput: string = '';
let operator: string = '';
let resetScreen: boolean = false;

document.querySelectorAll('.buttons button').forEach(button => {
    button.addEventListener('click', () => {
        const value = (button as HTMLButtonElement).getAttribute('data-value');
        if (value) handleInput(value);
    });
});

document.getElementById('equals')?.addEventListener('click', calculate);
document.getElementById('reset')?.addEventListener('click', resetCalculator);
document.getElementById('del')?.addEventListener('click', deleteLastChar);

function handleInput(value: string): void {
    if (resetScreen) {
        pantalla.textContent = '';
        resetScreen = false;
    }

    if (['+', '-', '*', '/'].includes(value)) {
        if (previousInput && currentInput && operator) {
            calculate();
        }
        operator = value;
        previousInput = currentInput;
        currentInput = '';
    } else {
        if (pantalla.textContent === '0') {
            pantalla.textContent = '';
        }
        currentInput += value;
        pantalla.textContent += value;
    }
}

function calculate(): void {
    if (previousInput && currentInput && operator) {
        const prev: number = parseFloat(previousInput);
        const current: number = parseFloat(currentInput);
        let result: number | undefined;

        switch (operator) {
            case '+':
                result = prev + current;
                break;
            case '-':
                result = prev - current;
                break;
            case '*':
                result = prev * current;
                break;
            case '/':
                result = prev / current;
                break;
        }

        if (result !== undefined) {
            pantalla.textContent = result.toString();
            previousInput = result.toString();
            currentInput = '';
            operator = '';
            resetScreen = true;
        }
    }
}

function resetCalculator(): void {
    currentInput = '';
    previousInput = '';
    operator = '';
    pantalla.textContent = '0';
}

function deleteLastChar(): void {
    currentInput = currentInput.slice(0, -1);
    pantalla.textContent = currentInput || '0';
}
