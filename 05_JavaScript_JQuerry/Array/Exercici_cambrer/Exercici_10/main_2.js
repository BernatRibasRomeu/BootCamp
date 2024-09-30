// Ara volem dividir el array en varios arrays nous i deixar algun element en el array original utilitzan els mètodes slice() i splice()
const ticket02 = ['🍹', '🥖', '☕', '🥯', '🍵', '🥐', '🥪'];
/* Expeted Output:
Person 1 Ticket: [ '☕', '🥐' ]
Person 2 Ticket: [ '🍵', '🥖' ]
Person 3 Ticket: [ '🍹', '🥪' ]
Remaining items in the original ticket: [ '🥯' ]*/
const ticketPersona1 = ['☕', '🥐'];
const ticketPersona2 = ['🍵', '🥖'];
const ticketPersona3 = ['🍹', '🥪'];
// Començem amb el mètode splice
//! const createIndividualTicket = (ticket, consumption) => {
//!     const individualTicket = [];
//!     for (const item of consumption) {
//!         const index = ticket.indexOf(item);
//!         if (index !== -1) {
//!             individualTicket.push(ticket.splice(index, 1)[0]);
//!         }
//!     }
//!     return individualTicket;
//! };

//! const persona1Ticket = createIndividualTicket(ticket02, ticketPersona1);
//! const persona2Ticket = createIndividualTicket(ticket02, ticketPersona2);
//! const persona3Ticket = createIndividualTicket(ticket02, ticketPersona3);

//! console.log('Tiquet persona 1:', persona1Ticket);
//! console.log('Tiquet persona 2:', persona2Ticket);
//! console.log('Tiquet persona 3:', persona3Ticket);
//! console.log('Resta del tiquet original:', ticket02);
// Ara farem el mateix però amb el mètode slice
const createIndividualTicket = (ticket, consumption) => {
    const individualTicket = [];
    for (const item of consumption) {
        const index = ticket.indexOf(item);
        if (index !== -1) {
            individualTicket.push(item);
        }
    }
    return individualTicket;
};

const persona1Ticket = createIndividualTicket(ticket02.slice(), ticketPersona1);
const persona2Ticket = createIndividualTicket(ticket02.slice(), ticketPersona2);
const persona3Ticket = createIndividualTicket(ticket02.slice(), ticketPersona3);

console.log('Tiquet persona 1:', persona1Ticket);
console.log('Tiquet persona 2:', persona2Ticket);
console.log('Tiquet persona 3:', persona3Ticket);
console.log('Resta del tiquet original:', ticket02);