const choices = ['✊', '🖐', '✌'];
let playerScore = 0;
let computerScore = 0;
const maxRounds = 5;
let currentRound = 0;

function computerChoice(){
    return choices[Math.floor(Math.random()*choices.length)]
}

function determineWinner(player, computer){
    if(player === computer){
        return "Heu empatat!";
    } else if (
        (player === 'piedra' && computer === 'tijeras') ||
        (player === 'papel' && computer === 'piedra') ||
        (player === 'tijeras' && computer === 'papel')
    ) {
        playerScore++;
        return "Has guanyat la ronda";
    } else {
        computerScore++;
        return "Has perdut la ronda";
    }
}

function showResult(playerChoice){
    const computer = computerChoice();
    const roundResult = determineWinner(playerChoice, computer)
    currentRound++;

    console.log("Has escollit: ${playerChoice}. El ordinador has escollit: ${computer}. ${roundResult}");
    console.log("Punts: Tu ${playerScore} - Ordinador ${computerScores}");

    if (currentRound === maxRounds){
        showFinalWinner();
        resetGame();
    }
}

function showFinalWinner(){
    let finalWinner;
    if (playerScore > computerScore) {
        finalWinner = "Has guanyat la partida"
    } else if (computerScore > playerScore){
        finalWinner = "Has perdut la partida"
    } else {
        finalWinner = "Heu empatat"
    }
}

function resetGame(){
    playerScore = 0;
    computerScore = 0;
    currentRound = 0;
    console.log("Juguem de nou");
}

document.getElementById('start').addEventListener('click', (e) => {
    e.preventDefault();
    const playerName = document.getElementById('jugador').value.trim();
    if (playerName) {
        console.log("Benvingut ${playerName}")
        document.querySelector('.nameForm').style.displey = none;
        document.querySelector('.game').style.displey = block;
    } else {
        alert("Introdueix un nom.")
    }
});

document.querySelectorAll('.stone', '.paper', '.scissors').forEach(button => {
    button.addEventListener('click', (e) => {
        e.preventDefault();

        const playerChoice = e.target.className === 'stone' ? 'piedra' :
                            e.target.className === 'paper' ? 'paper' : 'tijeras';
        showResult(playerChoice);
    })
});
