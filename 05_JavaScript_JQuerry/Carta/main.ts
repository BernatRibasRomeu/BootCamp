const cards = document.querySelectorAll('.card-inner');

cards.forEach((card) => {
    const cardBack = card.querySelector('.card-back') as HTMLElement;
    const cardFront = card.querySelector('.card-front') as HTMLElement;

    cardFront.style.opacity = '0';

    cardBack.addEventListener('mouseenter', () => {
        card.classList.add('card-flip');
        cardBack.style.opacity = '0';
        cardFront.style.opacity = '1';
    });

    cardFront.addEventListener('mouseleave', () => {
        card.classList.remove('card-flip');
        cardBack.style.opacity = '1';
        cardFront.style.opacity = '0';
    });
});
