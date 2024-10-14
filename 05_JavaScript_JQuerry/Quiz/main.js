var _a, _b;
// Preguntas y respuestas
var questions = [
    {
        question: '¿Quién es el líder de toda la humanidad?',
        options: ['Horus', 'Guilliman', 'El Emperador', 'Sanguinius'],
        correct: 'El Emperador'
    },
    { question: '¿Qué evento catastrófico dividió al Imperio de la Humanidad y provocó la creación de la Gran Fisura (Cicatrix Maledictum)?',
        options: ['La Herejía de Horus',
            'La Cruzada Indómita',
            'El Gran Cisma',
            'La Caída de Cadia'],
        correct: 'La Herejía de Horus' },
    {
        question: '¿Qué es el Omnissiah en la cultura del Adeptus Mechanicus?',
        options: ['Un dios mecánico',
            'El Emperador de la Humanidad',
            'Una IA de la Era Oscura',
            'Un Primarca'],
        correct: 'Un dios mecánico'
    },
    {
        question: '¿Qué Primarca traicionó al Emperador y lideró una rebelión contra él durante la Herejía de Horus?',
        options: ['Fulgrim',
            'Lorgar',
            'Magnus el Rojo',
            'Horus Lupercal'],
        correct: 'Horus Lupercal'
    },
    {
        question: '¿Cuál es el nombre del planeta natal de los Ultramarines?',
        options: ['Terra',
            'Fenris',
            'Macragge',
            'Ultramar'],
        correct: 'Macragge'
    },
    {
        question: '¿Qué son los Necrones en el universo de Warhammer 40k?',
        options: ['Antiguos humanos mejorados cibernéticamente',
            'Inteligencias artificiales creadas por los Eldar',
            'Demonios del Caos',
            'Xenos inmortales con cuerpos de metal'],
        correct: 'Xenos inmortales con cuerpos de metal'
    },
    {
        question: '¿Cuáles son las deidades principales de los Orkos?',
        options: ['Makari y un garrapatoz',
            'Khaine y Khorne',
            'Gorko y Morko',
            'Sigismund y Valdor'],
        correct: 'Gorko y Morko'
    },
    {
        question: '¿Qué se requiere para crear un Marine Espacial (Astartes)?',
        options: ['Un humano con habilidades psíquicas',
            'Un adolescente físicamente perfecto que soporta el implante de órganos genéticos',
            'Un humano que sobrevive al ritual en Ojo de Terror',
            'Un guerrero Xenos que se alía con el Imperio'],
        correct: 'Un adolescente físicamente perfecto que soporta el implante de órganos genéticos'
    },
    {
        question: '¿Qué es el Ojo del Terror en Warhammer 40k?',
        options: ['Una superarma imperial',
            'Un agujero negro cerca de Terra',
            'Un portal inmenso hacia la disformidad donde habitan los dioses del Caos',
            'Un símbolo de los Astartes del Caos'],
        correct: 'Un portal inmenso hacia la disformidad donde habitan los dioses del Caos'
    },
    {
        question: '¿Cuál es el propósito de la Inquisición en el Imperio de la Humanidad?',
        options: ['Destruir Xenos',
            'Eliminar cualquier amenaza al Imperio, ya sea alienígena, demoníaca o herética',
            'Conquistar nuevos planetas',
            'Investigar nuevos mundos y tecnologías'],
        correct: 'Eliminar cualquier amenaza al Imperio, ya sea alienígena, demoníaca o herética'
    },
    {
        question: '¿Cuál es el verdadero nombre de la entidad conocida como "El Dios de los Mil Hijos" o "El Dios Que Cambia", el dios del Caos del cambio, el conocimiento y la mutación?',
        options: ['Nurgle', 'Slaneesh', 'Tzeentch', 'Khorne'],
        correct: 'Tzeentch'
    },
    {
        question: 'Durante la Herejía de Horus, ¿qué artefacto psíquico crucial usó Magnus el Rojo para advertir al Emperador sobre la traición de Horus, lo que resultó en la destrucción de Prospero?',
        options: ['El Manto de Ahriman', 'El Ojo de Magnus', 'El Corazón del Vacío', 'La Torre de la Visión'],
        correct: 'El Ojo de Magnus'
    },
    {
        question: '¿Cuál fue la causa de la "Traición de los Custodios" durante la Primera Cruzada Negra, cuando Constantin Valdor y los Adeptus Custodes se negaron a apoyar directamente a las fuerzas Imperiales?',
        options: ['El Emperador ordenó no interferir',
            'Los Custodios consideraban corrupto el Senado Imperial',
            'Una antigua promesa a los Caballeros Grises',
            'La naturaleza del destino de la humanidad que vieron en Terra'],
        correct: 'El Emperador ordenó no interferir'
    },
    // Añade más preguntas aquí
];
var currentQuestionIndex = 0;
var score = 0;
var selectedMode = 'practice';
// Referencias al DOM
var modeSelection = document.getElementById('mode-selection');
var quizSection = document.getElementById('quiz-section');
var modeTitle = document.getElementById('mode-title');
var questionContainer = document.getElementById('question-container');
var feedback = document.getElementById('feedback');
var nextButton = document.getElementById('next-question');
var submitButton = document.getElementById('submit-quiz');
// Función para mostrar preguntas
function showQuestion() {
    feedback.innerHTML = ''; // Limpiar feedback
    var question = questions[currentQuestionIndex];
    questionContainer.innerHTML = "\n      <p>".concat(question.question, "</p>\n      ").concat(question.options.map(function (option, index) { return "\n        <button class=\"option-btn\" data-option=\"".concat(option, "\">").concat(index + 1, ". ").concat(option, "</button>\n      "); }).join(''), "\n    ");
    // Agregar eventos a los botones de las opciones
    var optionButtons = document.querySelectorAll('.option-btn');
    optionButtons.forEach(function (button) {
        button.addEventListener('click', function () { return handleAnswer(button.getAttribute('data-option') || ""); });
    });
}
// Función para manejar la respuesta
function handleAnswer(selectedAnswer) {
    var correctAnswer = questions[currentQuestionIndex].correct;
    if (selectedMode === 'practice') {
        if (selectedAnswer === correctAnswer) {
            feedback.innerHTML = '¡Correcto!';
            score++;
        }
        else {
            feedback.innerHTML = "Incorrecto. La respuesta correcta es ".concat(correctAnswer, ".");
        }
        nextButton.style.display = 'inline';
    }
    else {
        // En modo examen no mostramos feedback inmediato
        if (selectedAnswer === correctAnswer)
            score++;
        nextQuestion();
    }
}
// Función para avanzar a la siguiente pregunta
function nextQuestion() {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        showQuestion();
        nextButton.style.display = 'none';
    }
    else {
        finishQuiz();
    }
}
// Función para finalizar el examen
function finishQuiz() {
    quizSection.style.display = 'none';
    alert("Examen finalizado. Tu puntuaci\u00F3n es: ".concat(score, "/").concat(questions.length));
    resetQuiz();
}
// Función para iniciar el test
function startQuiz(mode) {
    selectedMode = mode;
    currentQuestionIndex = 0;
    score = 0;
    modeSelection.style.display = 'none';
    quizSection.style.display = 'block';
    modeTitle.innerHTML = mode === 'practice' ? 'Modo Práctica' : 'Modo Examen';
    showQuestion();
    if (mode === 'exam') {
        submitButton.style.display = 'inline';
    }
    else {
        submitButton.style.display = 'none';
    }
}
// Función para resetear el test
function resetQuiz() {
    modeSelection.style.display = 'block';
    quizSection.style.display = 'none';
    nextButton.style.display = 'none';
}
// Eventos para los botones de selección de modo
(_a = document.getElementById('practice-mode')) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () { return startQuiz('practice'); });
(_b = document.getElementById('exam-mode')) === null || _b === void 0 ? void 0 : _b.addEventListener('click', function () { return startQuiz('exam'); });
// Evento para el botón "Siguiente" en modo práctica
nextButton.addEventListener('click', nextQuestion);
// Evento para el botón "Terminar Examen"
submitButton.addEventListener('click', finishQuiz);
