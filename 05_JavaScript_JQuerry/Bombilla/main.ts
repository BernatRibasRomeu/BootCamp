document.addEventListener("DOMContentLoaded", () => {
    const bulbOn = document.querySelector('.bulb-on') as HTMLImageElement;
    const bulbOff = document.querySelector('.bulb-off') as HTMLImageElement;
    const switchOn = document.querySelector('.switch-on') as HTMLImageElement;
    const switchOff = document.querySelector('.switch-off') as HTMLImageElement;
    const intensityInput = document.getElementById('intensity') as HTMLInputElement;

    bulbOn.style.display = 'none';
    bulbOff.style.display = 'block'
    switchOn.style.display = 'none';

    const turnOn = () => {
        bulbOff.style.display = 'none';
        bulbOn.style.display = 'block';
        switchOff.style.display = 'none';
        switchOn.style.display = 'block';
        adjustIntensity();
    };
    
    const turnOff = () => {
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
        intensityInput.value = '0'; // O cualquier lógica que desees implementar
        bulbOff.style.display = 'block';
    };

    switchOff.addEventListener('click', turnOn);

    switchOn.addEventListener('click', turnOff);

    intensityInput.addEventListener('input', adjustIntensity);
});
