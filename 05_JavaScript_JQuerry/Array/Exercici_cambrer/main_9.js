// Hem d'ordenar el seguent tickets de diferents maneres
// Primer fem servir el mètode sort
const tickets = [1, 100000, 21, 30, 4]
let n = tickets.length;
console.log(tickets.sort((a, b) => a - b));
// Ara ho fem amb un bucle for sense mètodes de programacio funcional
for (let i = 0; i < n; i++) {
    for (let j = 0; j < n - 1; j++) {
        if (tickets[j] > tickets[j + 1]) {
            // Intercambiamos los elementos
            let temp = tickets[j];
            tickets[j] = tickets[j + 1];
            tickets[j + 1] = temp;
        }
    }
}
// console.log(tickets)
// Ara fem servir el spread operator
let sortedTickets = [...tickets].sort((a, b) => a - b);
console.log(sortedTickets);