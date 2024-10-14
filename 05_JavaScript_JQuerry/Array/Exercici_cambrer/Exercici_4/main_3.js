// Ara volem donar format a un nou array de 4 maneres diferents
const sopar = ['🍔', '🌭', '🍟', '🍟', '🍕', '🥤', '🥤'];
// Aqui farem servir un bucle for amb sense array auxiliar
let n = sopar.length;
for (let i = 0; i < Math.floor(n / 2); i++) {
    [sopar[i], sopar[n - 1 - i]] = [sopar[n - 1 - i], sopar[i]];
}
sopar.unshift("🍸");
console.log(sopar);