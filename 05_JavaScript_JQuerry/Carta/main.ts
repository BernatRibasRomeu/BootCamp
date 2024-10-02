const cardBack = document.getElementsByClassName('back') as HTMLCollectionOf<HTMLElement>;
const cardFront = document.getElementsByClassName('front') as HTMLCollectionOf<HTMLElement>;

for (let i = 0; i < cardFront.length; i++) {
    cardFront[i].style.display = 'none';
}
for (let i = 0; i < cardBack.length; i++) {
    cardBack[i].addEventListener('mousemove', (e) => {
        cardBack[i].style.display = 'none';
        cardFront[i].style.display = 'inline';
    });
    cardFront[i].addEventListener('mouseout', (e) => {
        cardFront[i].style.display = 'none';
        cardBack[i].style.display = 'inline';
    });
}
