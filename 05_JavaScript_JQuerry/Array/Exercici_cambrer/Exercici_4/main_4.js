// Ara volem donar format a un nou array de 4 maneres diferents
const sopar = ['🍔', '🌭', '🍟', '🍟', '🍕', '🥤', '🥤'];
// Aqui farem servir un bucle for each
let n = sopar.length
sopar.forEach((element, i, sopar) => {
    const nouIndex = sopar.length - 1 - i;
    if (i < nouIndex){
        [sopar[i], sopar[nouIndex]] = [sopar[nouIndex], sopar[i]]
    }
});
console.log(sopar.unshift("🍸"));
console.log(sopar);