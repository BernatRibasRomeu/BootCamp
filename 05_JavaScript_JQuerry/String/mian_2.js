/* Creem una funcio que verifiqui si una cadena de text comença per "aca", 
cridem a la funció un cop amb una academia i un segon cop amb una altre escola */

function aca (nom) {
    if (nom.includes("Aca")){
        console.log(nom)
    } else {
        console.log("No és una acadèmia")
    }
}

aca("Acadèmia El Foix");
aca("Institut El Foix");