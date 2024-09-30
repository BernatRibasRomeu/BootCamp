// Ara volem donar format a un nou array de 4 maneres diferents
const sopar = ['🍔', '🌭', '🍟', '🍟', '🍕', '🥤', '🥤'];
// Aqui farem servir un bucle for amb un array auxiliar
const nouSopar = [];
for (let i = sopar.length - 1; i >= 0; i--) {
    nouSopar.push(sopar[i]);
}
nouSopar.unshift("🍸")
console.log(nouSopar);