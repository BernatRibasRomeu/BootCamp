// * Creem una funció amb paràmetre infinits amb un forEach per imprimir els valors donats al inicialitzar la funció.
const infinit = function(...valors){
    valors.forEach(item=> {
        console.log(item)
    });
}
infinit(1,2,3,4,5)