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
    else if ((player === '👊' && computer === '✌') ||
        (player === '🖐' && computer === '👊') ||
        (player === '✌' && computer === '🖐')) {
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
    console.log(`Has escollit: ${playerChoice}. El ordinador has escollit: ${computer}. ${roundResult}`);
    console.log(`Punts: Tu ${playerScore} - Ordinador ${computerScore}`);
    if (currentRound === maxRounds) {
        showFinalWinner();
        setTimeout(resetGame, 5000);
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
    console.log(finalWinner);
}
function resetGame() {
    playerScore = 0;
    computerScore = 0;
    currentRound = 0;
    console.clear();
    console.log("Juguem de nou");
}

document.querySelectorAll('.stone, .paper, .scissors').forEach(function (button) {
    button.addEventListener('click', function (e) {
        e.preventDefault();
        var target = e.target;
        var playerChoice = target.classList.contains('stone') ? '👊' :
            target.classList.contains('paper') ? '🖐' : '✌';
        showResult(playerChoice);
    });
});
