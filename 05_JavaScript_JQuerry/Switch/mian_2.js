// * Creem un switch que al introduir un numero per string el converteixi en numero
let valor = "2";
console.log("El número és " + valor + " i és de tipus " + typeof valor + " però després del switch és:")
switch (valor) {
    case "1":
        valor = Number(valor);
        console.log(typeof Num(valor));
        break;
    case "2":
        valor = Number(valor);
        console.log(typeof valor);
        break;
    case "3":
        valor = Number(valor);
        console.log(typeof valor);
        break;
    case "4":
        valor = Number(valor);
        console.log(typeof Num(valor));
        break;
    case "5":
        valor = Number(valor);
        console.log(typeof Num(valor));
        break;
    default:
        console.log("Introdueix un numero del 1 al 5.")
        break;
}