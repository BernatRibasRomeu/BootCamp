var choices = ['✊', '🖐', '✌'];
var playerScore = 0;
var computerScore = 0;
var maxRounds = 5;
var currentRound = 0;
function computerChoice() {
    return choices[Math.floor(Math.random() * choices.length)];
}
function determineWinner(player, computer) {
    if (player === computer) {
        return "Heu empatat!";
    }
    else if ((player === 'piedra' && computer === 'tijeras') ||
        (player === 'papel' && computer === 'piedra') ||
        (player === 'tijeras' && computer === 'papel')) {
        playerScore++;
        return "Has guanyat la ronda";
    }
    else {
        computerScore++;
        return "Has perdut la ronda";
    }
}
function showResult(playerChoice) {
    var computer = computerChoice();
    var roundResult = determineWinner(playerChoice, computer);
    currentRound++;
    console.log("Has escollit: ${playerChoice}. El ordinador has escollit: ${computer}. ${roundResult}");
    console.log("Punts: Tu ${playerScore} - Ordinador ${computerScores}");
    if (currentRound === maxRounds) {
        showFinalWinner();
        resetGame();
    }
}
function showFinalWinner() {
    var finalWinner;
    if (playerScore > computerScore) {
        finalWinner = "Has guanyat la partida";
    }
    else if (computerScore > playerScore) {
        finalWinner = "Has perdut la partida";
    }
    else {
        finalWinner = "Heu empatat";
    }
}
function resetGame() {
    playerScore = 0;
    computerScore = 0;
    currentRound = 0;
    console.log("Juguem de nou");
}
document.getElementById('start').addEventListener('click', function (e) {
    e.preventDefault();
    var playerName = document.getElementById('jugador').value.trim();
    if (playerName) {
        console.log("Benvingut ".concat(playerName));
        document.querySelector('.nameForm').style.display = 'none';
        document.querySelector('.game').style.display = 'block';
    }
    else {
        alert("Introdueix un nom.");
    }
});
document.querySelectorAll('.stone, .paper, .scissors').forEach(function (button) {
    button.addEventListener('click', function (e) {
        e.preventDefault();
        var target = e.target;
        var playerChoice = target.classList.contains('stone') ? 'piedra' :
            target.classList.contains('paper') ? 'paper' : 'tijeras';
        showResult(playerChoice);
    });
});
