document.addEventListener("DOMContentLoaded", function () {
    var bulbOn = document.querySelector('.bulb-on');
    var bulbOff = document.querySelector('.bulb-off');
    var switchOn = document.querySelector('.switch-on');
    var switchOff = document.querySelector('.switch-off');
    var intensityInput = document.getElementById('intensity');
    bulbOn.style.display = 'none';
    bulbOff.style.display = 'block';
    switchOn.style.display = 'none';
    var turnOn = function () {
        bulbOff.style.display = 'none';
        bulbOn.style.display = 'block';
        switchOff.style.display = 'none';
        switchOn.style.display = 'block';
        adjustIntensity();
    };
    var turnOff = function () {
        bulbOn.style.display = 'none';
        bulbOff.style.display = 'block';
        switchOn.style.display = 'none';
        switchOff.style.display = 'block';
        intensityInput.setAttribute('disabled', 'true');
        intensityInput.removeEventListener('input', disableIntensity);
    };
    var adjustIntensity = function () {
        bulbOff.style.opacity = '0';
        bulbOff.style.display = 'block';
        var intensityValue = Number(intensityInput.value);
        bulbOn.style.opacity = (intensityValue / 100).toString();
        bulbOff.style.opacity = (1 - (intensityValue / 100)).toString();
    };
    var disableIntensity = function () {
        intensityInput.value = '0'; // O cualquier lógica que desees implementar
        bulbOff.style.display = 'block';
    };
    switchOff.addEventListener('click', turnOn);
    switchOn.addEventListener('click', turnOff);
    intensityInput.addEventListener('input', adjustIntensity);
});
