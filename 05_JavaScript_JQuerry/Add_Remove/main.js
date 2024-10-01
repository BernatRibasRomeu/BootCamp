let options = ['👾', '🎮', '🕹', '💻', '📺', '🖱', '🏎', '🎧'];

let items = [];

function getRandomOption(){
    const randomIndex = Math.floor(Math.random() * options.length);
    return options[randomIndex];
}

function updateList(){
    const list = document.getElementById('list');
    list.innerHTML = '';

    const formattedArray = `[${items.join(', ')}]`;
    list.textContent = formattedArray;
}

document.getElementById('push').addEventListener('click', () => {
    items.push(getRandomOption());
    updateList();
});

document.getElementById('unshift').addEventListener('click', () => {
    items.unshift(getRandomOption());
    updateList();
});

document.getElementById('insert').addEventListener('click', () => {
    const index = parseInt(document.getElementById('insertNum').value);
    if (index >= 0 && index <= 10) {
        items.splice(index, 0, getRandomOption());
        updateList();
    }else{
        alert("Valor incorrecte, intenta amb números entre 0 i 10.")
    }
});

document.getElementById('pop').addEventListener('click', () => {
    items.pop(getRandomOption());
    updateList();
});

document.getElementById('shift').addEventListener('click', () => {
    items.shift(getRandomOption());
    updateList();
});

document.getElementById('remove').addEventListener('click', () => {
    const index = parseInt(document.getElementById('removeNum').value);
    if (index >= 0 && index <= 10){
        items.splice(index, 1);
        updateList();
    } else {
        alert("Valor incorrecte, intenta amb números entre 0 i 10.");
    }
});