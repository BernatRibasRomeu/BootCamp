document.addEventListener("DOMContentLoaded", function () {
    var bulb = document.querySelectorAll('.bulb');
    var bulbOn = document.querySelector('.bulb-on');
    var bulbOff = document.querySelector('.bulb-off');
    var switchOn = document.querySelector('.switch-on');
    var switchOff = document.querySelector('.switch-off');
    var intensityInput = document.getElementById('intensity');
    var sizeInput = document.getElementById('size');
    var rotationInput = document.getElementById('rotation');
    var isTurnedOn = false;
    bulbOn.style.display = 'none';
    bulbOff.style.display = 'block';
    switchOn.style.display = 'none';
    var turnOn = function () {
        isTurnedOn = true;
        bulbOff.style.display = 'none';
        bulbOn.style.display = 'block';
        switchOff.style.display = 'none';
        switchOn.style.display = 'block';
    };
    var turnOff = function () {
        isTurnedOn = false;
        bulbOn.style.display = 'none';
        bulbOff.style.display = 'block';
        bulbOff.style.opacity = '100';
        switchOn.style.display = 'none';
        switchOff.style.display = 'block';
    };
    var adjustIntensity = function () {
        if (isTurnedOn) {
            bulbOff.style.display = 'block';
            var intensityValue = Number(intensityInput.value);
            bulbOn.style.opacity = (intensityValue / 100).toString();
            bulbOff.style.opacity = (1 - (intensityValue / 100)).toString();
        }
        else {
            bulbOff.style.display = 'block';
            bulbOff.style.opacity = '100';
        }
    };
    var adjustSize = function () {
        var sizeValue = Number(sizeInput.value);
        bulb.forEach(function (element) {
            if (sizeValue <= 100) {
                var minSize = 100;
                element.style.width = "".concat((minSize.toString()), "px");
            }
            else {
                element.style.width = "".concat((sizeValue.toString()), "px");
            }
        });
    };
    var adjustRotation = function () {
        var rotationValue = Number(rotationInput.value);
        bulb.forEach(function (element) {
            element.style.transform = "rotate(".concat(rotationValue, "deg)");
        });
    };
    switchOff.addEventListener('click', turnOn);
    switchOn.addEventListener('click', turnOff);
    intensityInput.addEventListener('input', adjustIntensity);
    sizeInput.addEventListener('input', adjustSize);
    rotationInput.addEventListener('input', adjustRotation);
});
