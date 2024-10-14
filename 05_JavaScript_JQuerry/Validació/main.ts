// Obtener referencias a los elementos del formulario
const form = document.getElementById("userForm") as HTMLFormElement;
const nameInput = document.getElementById("name") as HTMLInputElement;
const surname1Input = document.getElementById("surname1") as HTMLInputElement;
const surname2Input = document.getElementById("surname2") as HTMLInputElement;
const userInput = document.getElementById("user") as HTMLInputElement;
const cityInput = document.getElementById("city") as HTMLInputElement;
const postalInput = document.getElementById("postal") as HTMLInputElement;
const provInput = document.getElementById("prov") as HTMLSelectElement;
const termsCheckbox = document.getElementById("terms") as HTMLInputElement;

// Validar el formulario al hacer submit
form.addEventListener("submit", (event) => {
    event.preventDefault(); // Evita el envío del formulario si hay errores

    // Validar cada campo individualmente
    const isNameValid = validateTextInput(nameInput, "El nom és obligatori.");
    const isSurname1Valid = validateTextInput(surname1Input, "El primer cognom és obligatori.");
    const isSurname2Valid = validateTextInput(surname2Input, "El segon cognom és obligatori.");
    const isUserValid = validateTextInput(userInput, "El nom d'usuari és obligatori.");
    const isCityValid = validateTextInput(cityInput, "La ciutat és obligatòria.");
    const isPostalValid = validatePostalCode(postalInput);
    const isProvinceValid = validateSelect(provInput, "Has de seleccionar una província.");
    const areTermsAccepted = validateTerms(termsCheckbox);

    // Si todos los campos son válidos, se puede enviar el formulario
    if (isNameValid && isSurname1Valid && isSurname2Valid && isUserValid && isCityValid && isPostalValid && isProvinceValid && areTermsAccepted) {
        form.submit();
    }
});

// Función para validar inputs de texto
function validateTextInput(input: HTMLInputElement, errorMsg: string): boolean {
    if (input.value.trim() === "") {
        alert(errorMsg);
        input.focus();
        return false;
    }
    return true;
}

// Función para validar el código postal (ejemplo básico)
function validatePostalCode(input: HTMLInputElement): boolean {
    const postalCode = input.value.trim();
    if (postalCode === "") {
        alert("El codi postal és obligatori.");
        input.focus();
        return false;
    } else if (!/^\d{5}$/.test(postalCode)) {
        alert("El codi postal ha de tenir 5 dígits.");
        input.focus();
        return false;
    }
    return true;
}

// Función para validar un select
function validateSelect(select: HTMLSelectElement, errorMsg: string): boolean {
    if (select.value === "") {
        alert(errorMsg);
        select.focus();
        return false;
    }
    return true;
}

// Función para validar si se han aceptado los términos
function validateTerms(checkbox: HTMLInputElement): boolean {
    if (!checkbox.checked) {
        alert("Has d'acceptar els termes i condicions.");
        checkbox.focus();
        return false;
    }
    return true;
}
