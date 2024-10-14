// Obtener referencias a los elementos del formulario
var form = document.getElementById("userForm");
var nameInput = document.getElementById("name");
var surname1Input = document.getElementById("surname1");
var surname2Input = document.getElementById("surname2");
var userInput = document.getElementById("user");
var cityInput = document.getElementById("city");
var postalInput = document.getElementById("postal");
var provInput = document.getElementById("prov");
var termsCheckbox = document.getElementById("terms");
// Validar el formulario al hacer submit
form.addEventListener("submit", function (event) {
    event.preventDefault(); // Evita el envío del formulario si hay errores
    // Validar cada campo individualmente
    var isNameValid = validateTextInput(nameInput, "El nom és obligatori.");
    var isSurname1Valid = validateTextInput(surname1Input, "El primer cognom és obligatori.");
    var isSurname2Valid = validateTextInput(surname2Input, "El segon cognom és obligatori.");
    var isUserValid = validateTextInput(userInput, "El nom d'usuari és obligatori.");
    var isCityValid = validateTextInput(cityInput, "La ciutat és obligatòria.");
    var isPostalValid = validatePostalCode(postalInput);
    var isProvinceValid = validateSelect(provInput, "Has de seleccionar una província.");
    var areTermsAccepted = validateTerms(termsCheckbox);
    // Si todos los campos son válidos, se puede enviar el formulario
    if (isNameValid && isSurname1Valid && isSurname2Valid && isUserValid && isCityValid && isPostalValid && isProvinceValid && areTermsAccepted) {
        form.submit();
    }
});
// Función para validar inputs de texto
function validateTextInput(input, errorMsg) {
    if (input.value.trim() === "") {
        alert(errorMsg);
        input.focus();
        return false;
    }
    return true;
}
// Función para validar el código postal (ejemplo básico)
function validatePostalCode(input) {
    var postalCode = input.value.trim();
    if (postalCode === "") {
        alert("El codi postal és obligatori.");
        input.focus();
        return false;
    }
    else if (!/^\d{5}$/.test(postalCode)) {
        alert("El codi postal ha de tenir 5 dígits.");
        input.focus();
        return false;
    }
    return true;
}
// Función para validar un select
function validateSelect(select, errorMsg) {
    if (select.value === "") {
        alert(errorMsg);
        select.focus();
        return false;
    }
    return true;
}
// Función para validar si se han aceptado los términos
function validateTerms(checkbox) {
    if (!checkbox.checked) {
        alert("Has d'acceptar els termes i condicions.");
        checkbox.focus();
        return false;
    }
    return true;
}
