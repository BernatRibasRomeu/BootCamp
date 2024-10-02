var cardBack = document.getElementsByClassName('back');
var cardFront = document.getElementsByClassName('front');
for (var i = 0; i < cardFront.length; i++) {
    cardFront[i].style.display = 'none';
}
var _loop_1 = function (i) {
    cardBack[i].addEventListener('mousemove', function (e) {
        cardBack[i].style.display = 'none';
        cardFront[i].style.display = 'inline';
    });
    cardFront[i].addEventListener('mouseout', function (e) {
        cardFront[i].style.display = 'none';
        cardBack[i].style.display = 'inline';
    });
};
for (var i = 0; i < cardBack.length; i++) {
    _loop_1(i);
}
