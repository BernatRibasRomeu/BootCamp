// * Crea una funcio que substitueixi las A per O d'una cadena de text
const text = "Avui dia 26, em treballat javaScript";
function eliminar (text){
    console.log(text.replaceAll("a" , "o"))
}

eliminar(text);