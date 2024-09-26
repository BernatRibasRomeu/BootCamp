// * Analitza que fa el seguent codi, explica el que fa. Quantes iteracions fa, quan entrarà al if? i al else?
let numero = 1;
let i = 0;
do { 
    // * EL do-while és un bucle que repetira el contingut del do sempre que no es compleixi 
    // *la condicio del while, el moment que numero creixi per sobre de 5 el do finalitza
    if (i === 0){ //*Aquest if verifica si tant el valor com el tipus de dada de i es el mateix que 0
        //* El cas d'entrar al if, incrementem i en 1 i reduim numero en 1
        i++;
        numero--;
        console.log(numero);
    } else {
        //* En cas que no entren al if i saltem al else, sumarem 1 al numero
        numero ++;
        console.log(numero)
    }
} while(numero < 5);

//* Al final veiem que farà 6 iteracions, que només entrarà al if la primera iteració i entrarà al else les altres 5 iteracions.