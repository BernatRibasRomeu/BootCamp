// * Creem una funció que per triar de manera aleatoria entre 1 i 0, en funció del resultat ens ha de dir si es cara(1) o creu(0)
function tirarMoneda() {
    let moneda = Math.round(Math.random());
    console.log(moneda)
    return moneda;
}

if (tirarMoneda() == 1){
    console.log("Ha sortit cara")
} else {
    console.log("Ha sortit creu")
}