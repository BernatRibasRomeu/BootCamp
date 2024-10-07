var rangeInput = document.getElementById('theme-range');
var root = document.documentElement;
if (rangeInput) {
    rangeInput.addEventListener('input', function () {
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
var pantalla = document.querySelector('.resultat');
pantalla.textContent = "0";
var buttons = document.querySelectorAll('.button');
var currentInput = "";
buttons.forEach(function (button) {
    button.addEventListener('click', function () {
        var buttonValue = button.textContent || "";
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
            }
            catch (error) {
                pantalla.textContent = "Error";
                currentInput = "";
            }
        }
        else {
            if (pantalla.textContent === "0" && !isNaN(Number(buttonValue))) {
                currentInput = buttonValue;
            }
            else {
                currentInput += buttonValue;
            }
            pantalla.textContent = currentInput;
        }
    });
});
