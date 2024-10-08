var _a, _b, _c;
var pantalla = document.getElementById('pantalla');
var currentInput = '';
var previousInput = '';
var operator = '';
var resetScreen = false;
document.querySelectorAll('.buttons button').forEach(function (button) {
    button.addEventListener('click', function () {
        var value = button.getAttribute('data-value');
        if (value)
            handleInput(value);
    });
});
(_a = document.getElementById('equals')) === null || _a === void 0 ? void 0 : _a.addEventListener('click', calculate);
(_b = document.getElementById('reset')) === null || _b === void 0 ? void 0 : _b.addEventListener('click', resetCalculator);
(_c = document.getElementById('del')) === null || _c === void 0 ? void 0 : _c.addEventListener('click', deleteLastChar);
function handleInput(value) {
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
    }
    else {
        if (pantalla.textContent === '0') {
            pantalla.textContent = '';
        }
        currentInput += value;
        pantalla.textContent += value;
    }
}
function calculate() {
    if (previousInput && currentInput && operator) {
        var prev = parseFloat(previousInput);
        var current = parseFloat(currentInput);
        var result = void 0;
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
function resetCalculator() {
    currentInput = '';
    previousInput = '';
    operator = '';
    pantalla.textContent = '0';
}
function deleteLastChar() {
    currentInput = currentInput.slice(0, -1);
    pantalla.textContent = currentInput || '0';
}
