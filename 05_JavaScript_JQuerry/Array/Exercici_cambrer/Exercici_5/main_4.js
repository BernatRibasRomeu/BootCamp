// Volem unir els dos arrays en un de sol amb diferents mètodes
const ticket01 = ['🍺', '🍺', '🥜']; 
const ticket02 = ['🍺', '🥪', '🥙'];
let combinedTicket = [];
// Ara utlitzarem bucles for
for (let i = 0; i < ticket01.length; i++) {
    combinedTicket[i] = ticket01[i];
}
for (let i = 0; i < ticket02.length; i++) {
combinedTicket[3 + i] = ticket02[i];    
}
console.log(combinedTicket);