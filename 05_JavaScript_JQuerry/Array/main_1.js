// * Modifiquem tots els elements a partir de la pizza i els convertim en 🍺.
let array = ['🍔', '🌯', '🥯', '🍕', '🍜', '🍱', '🍙', '🍘', '🥑'];
console.log(array.fill('🍺', 4));

// * Busca una 🍍 en el seguent array
let array2 = ['🍕' ,'🍕', '🍍', '🍕', '🍕'];
if (array2.includes('🍍')){
    console.log("Si, tenim una 🍍 al array")
}

// * Ara volem eliminar la 🍍 del array
console.log(array2.filter(item => item !== '🍍'));

// * Amb el seguent array converteix totes les 🍓 en 🍄
let array3 = ['🍓', '🍋', '🍓', '🍋', '🍓'];
console.log(array3.map(item => item === '🍓' ? '🍄' :item));

// * Afegeix el seguent icona 🥵 després de cada 🌶
let array4 = ['🌶', '🥛', '🌶', '🥛', '🌶', '🥛']
let newArray4 = array4.reduce((acc, item) => {
    acc.push(item);
    if(item === '🌶'){
        acc.push('🥵');
    }
    return acc;
}, []);
console.log(newArray4);

// * Afegeix una carta 🃏 entre dues 🎴
let array5 = ['🎴', '🎴', '🎴', '🃏', '🎴', '🎴', '🎴'];
let newArray5 = array5.reduce((acc, item, index, arr) => {
    acc.push(item);
    if(item === '🎴' && arr[index + 1] !== '🃏'){
        acc.push('🃏');
    }
    return acc;
}, []);
console.log(newArray5)
