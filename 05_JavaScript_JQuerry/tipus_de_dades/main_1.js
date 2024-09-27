let  nom;
nom = "Bernat";
let edat;
edat = 29;
let cert;
cert = true;
let buit;
buit = null;
let variable1;
let smbol1;
symbol1 = ("Hola");

console.log(nom);
console.log(typeof nom);
console.log(edat);
console.log(typeof edat);
console.log(cert);
console.log(typeof cert);
console.log(buit);
console.log(typeof buit);
console.log(variable1);
console.log(typeof variable1);
console.log(symbol1);
console.log(typeof symbol1);

console.log("això són variables let de scope global, ara crearem variables de scope local")

if(true){
    let cognom = "Ribas"
}

console.log(cognom)
console.log(typeof cognom)