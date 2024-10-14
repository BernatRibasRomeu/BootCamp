// Hem de comprovar que en els dos arrays seguents només tinguem cafes amb llet
const ticket01 = ['☕', '☕', '☕', '☕'];
const ticket02 = ['☕', '🥖', '☕', '🥯', '🍵', '🥐', '🥪'];

console.log(ticket01.every(item => item == "☕"));
// Sortira true ja que cada element del array es ☕
console.log(ticket02.every(item => item == "☕"));
// Soortida false ja que els elements del array son diferents a ☕
