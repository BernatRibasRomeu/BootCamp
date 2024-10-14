document.addEventListener("DOMContentLoaded", () => {
    const bulb = document.querySelectorAll('.bulb') as NodeListOf<HTMLElement>;
    const bulbOn = document.querySelector('.bulb-on') as HTMLImageElement;
    const bulbOff = document.querySelector('.bulb-off') as HTMLImageElement;
    const switchOn = document.querySelector('.switch-on') as HTMLImageElement;
    const switchOff = document.querySelector('.switch-off') as HTMLImageElement;
    const intensityInput = document.getElementById('intensity') as HTMLInputElement;
    const sizeInput = document.getElementById('size') as HTMLInputElement;
    const rotationInput = document.getElementById('rotation') as HTMLInputElement;

    let isTurnedOn = false;

    bulbOn.style.display = 'none';
    bulbOff.style.display = 'block'
    switchOn.style.display = 'none';

    const turnOn = () => {
        isTurnedOn = true;
        bulbOff.style.display = 'none';
        bulbOn.style.display = 'block';
        switchOff.style.display = 'none';
        switchOn.style.display = 'block';
    };

    const turnOff = () => {
        isTurnedOn = false;
        bulbOn.style.display = 'none';
        bulbOff.style.display = 'block';
        bulbOff.style.opacity ='100';
        switchOn.style.display = 'none';
        switchOff.style.display = 'block';
    };

    const adjustIntensity = () => {
        if (isTurnedOn) {
            bulbOff.style.display = 'block';
            const intensityValue = Number(intensityInput.value);
            bulbOn.style.opacity = (intensityValue / 100).toString();
            bulbOff.style.opacity = (1 - (intensityValue / 100)).toString();
        } else {
            bulbOff.style.display = 'block';
            bulbOff.style.opacity ='100';
        }
    };

    const adjustSize = () => {
        const sizeValue = Number(sizeInput.value);
        bulb.forEach(element => {
            if (sizeValue <= 100) {
                let minSize = 100;
                element.style.width = `${(minSize.toString())}px`
            } else {
                element.style.width = `${(sizeValue.toString())}px`;
            }
        });
    };

    const adjustRotation = () => {
        const rotationValue = Number(rotationInput.value);
        bulb.forEach(element => {
            element.style.transform = `rotate(${rotationValue}deg)`
        });

    }
    switchOff.addEventListener('click', turnOn);

    switchOn.addEventListener('click', turnOff);

    intensityInput.addEventListener('input', adjustIntensity);

    sizeInput.addEventListener('input', adjustSize);

    rotationInput.addEventListener('input', adjustRotation);
});