// Volem unir els dos arrays en un de sol amb diferents mètodes
const ticket01 = ['🍺', '🍺', '🥜']; 
const ticket02 = ['🍺', '🥪', '🥙'];
let combinedTicket = [];
// Aqui em de utilitzar el spread operator
combinedTicket = [...ticket01, ...ticket02]
console.log(combinedTicket);