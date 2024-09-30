// Volem unir els dos arrays en un de sol amb diferents mètodes
const ticket01 = ['🍺', '🍺', '🥜']; 
const ticket02 = ['🍺', '🥪', '🥙'];
let combinedTicket = [];
// Ara farem servi un forEach
ticket01.forEach((element) => combinedTicket.push(element));
ticket02.forEach((element) => combinedTicket.push(element));
console.log(combinedTicket);