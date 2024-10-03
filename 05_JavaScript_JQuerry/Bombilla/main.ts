document.addEventListener("DOMContentLoaded", () => {
    const bulb = document.querySelectorAll('.bulb') as NodeListOf<HTMLElement>;
    const bulbOn = document.querySelector('.bulb-on') as HTMLImageElement;
    const bulbOff = document.querySelector('.bulb-off') as HTMLImageElement;
    const switchOn = document.querySelector('.switch-on') as HTMLImageElement;
    const switchOff = document.querySelector('.switch-off') as HTMLImageElement;
    const intensityInput = document.getElementById('intensity') as HTMLInputElement;
    const sizeInput = document.getElementById('size') as HTMLInputElement;

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
        adjustIntensity();
    };

    const turnOff = () => {
        isTurnedOn = false;
        bulbOn.style.display = 'none';
        bulbOff.style.display = 'block';
        switchOn.style.display = 'none';
        switchOff.style.display = 'block';
        intensityInput.setAttribute('disabled', 'true');
        intensityInput.removeEventListener('input', disableIntensity);
    };

    const adjustIntensity = () => {
        bulbOff.style.opacity = '0';
        bulbOff.style.display = 'block';
        const intensityValue = Number(intensityInput.value);
        bulbOn.style.opacity = (intensityValue / 100).toString();
        bulbOff.style.opacity = (1 - (intensityValue / 100)).toString();
    };

    const disableIntensity = () => {
        if (isTurnedOn) {
            bulbOff.style.opacity = '0';
            bulbOff.style.display = 'block';
            const intensityValue = Number(intensityInput.value);
            bulbOn.style.opacity = (intensityValue / 100).toString();
            bulbOff.style.opacity = (1 - (intensityValue / 100)).toString();
        } else {
            bulbOff.style.opacity ='100';
            bulbOff.style.display = 'block';
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

    switchOff.addEventListener('click', turnOn);

    switchOn.addEventListener('click', turnOff);

    intensityInput.addEventListener('input', adjustIntensity);

    sizeInput.addEventListener('input', adjustSize);
});