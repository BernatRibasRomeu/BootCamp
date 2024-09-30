// Exercici 1,2 i 3 de arrays de notion https://davidbernalgonzalez.notion.site/Array-Methods-d3a2c16e26a24d16b5f4d6324e2a5fb4
// Tenim un cambrer servint un sopar
const sopar = [];
// El client demana una hambuerguesa i un frankfurt
sopar.push("🍔");
sopar.push("🌭")
console.log(sopar);
// Ens em deixat les patates
sopar.push("🍟", "🍟");
console.log(sopar);
// Ens demanen dos begudes, pero no podem fer servir mètodes de arrays
// Farem servir les posicions del array
sopar[sopar.length] = "🥤";
sopar[sopar.length] = "🥤";
console.log(sopar);

