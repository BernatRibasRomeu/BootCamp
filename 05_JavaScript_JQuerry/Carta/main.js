var cards = document.querySelectorAll('.card-inner');
cards.forEach(function (card) {
    var cardBack = card.querySelector('.card-back');
    var cardFront = card.querySelector('.card-front');
    cardFront.style.opacity = '0';
    cardBack.addEventListener('mouseenter', function () {
        card.classList.add('card-flip');
        cardBack.style.opacity = '0';
        cardFront.style.opacity = '1';
    });
    cardFront.addEventListener('mouseleave', function () {
        card.classList.remove('card-flip');
        cardBack.style.opacity = '1';
        cardFront.style.opacity = '0';
    });
});
