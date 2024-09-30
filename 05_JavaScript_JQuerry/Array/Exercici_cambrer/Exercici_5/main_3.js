// Volem unir els dos arrays en un de sol amb diferents mètodes
const ticket01 = ['🍺', '🍺', '🥜']; 
const ticket02 = ['🍺', '🥪', '🥙'];
let combinedTicket = [];
// Ara farem servir el mètode push
combinedTicket.push.apply(combinedTicket, ticket01);
combinedTicket.push.apply(combinedTicket, ticket02);
console.log(combinedTicket);