// Preguntas y respuestas
const questions = [
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

let currentQuestionIndex: number = 0;
let score: number = 0;
let selectedMode: 'practice' | 'exam' = 'practice';

// Referencias al DOM
const modeSelection = document.getElementById('mode-selection') as HTMLElement;
const quizSection = document.getElementById('quiz-section') as HTMLElement;
const modeTitle = document.getElementById('mode-title') as HTMLElement;
const questionContainer = document.getElementById('question-container') as HTMLElement;
const feedback = document.getElementById('feedback') as HTMLElement;
const nextButton = document.getElementById('next-question') as HTMLElement;
const submitButton = document.getElementById('submit-quiz') as HTMLElement;

// Función para mostrar preguntas
function showQuestion() {
    feedback.innerHTML = ''; // Limpiar feedback
    const question = questions[currentQuestionIndex];
    questionContainer.innerHTML = `
      <p>${question.question}</p>
      ${question.options.map((option, index) => `
        <button class="option-btn" data-option="${option}">${index + 1}. ${option}</button>
      `).join('')}
    `;

    // Agregar eventos a los botones de las opciones
    const optionButtons = document.querySelectorAll('.option-btn');
    optionButtons.forEach(button => {
        button.addEventListener('click', () => handleAnswer(button.getAttribute('data-option') || ""));
    });
}

// Función para manejar la respuesta
function handleAnswer(selectedAnswer: string) {
    const correctAnswer = questions[currentQuestionIndex].correct;

    if (selectedMode === 'practice') {
        if (selectedAnswer === correctAnswer) {
            feedback.innerHTML = '¡Correcto!';
            score++;
        } else {
            feedback.innerHTML = `Incorrecto. La respuesta correcta es ${correctAnswer}.`;
        }
        nextButton.style.display = 'inline';
    } else {
        // En modo examen no mostramos feedback inmediato
        if (selectedAnswer === correctAnswer) score++;
        nextQuestion();
    }
}

// Función para avanzar a la siguiente pregunta
function nextQuestion() {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        showQuestion();
        nextButton.style.display = 'none';
    } else {
        finishQuiz();
    }
}

// Función para finalizar el examen
function finishQuiz() {
    quizSection.style.display = 'none';
    alert(`Examen finalizado. Tu puntuación es: ${score}/${questions.length}`);
    resetQuiz();
}

// Función para iniciar el test
function startQuiz(mode: 'practice' | 'exam') {
    selectedMode = mode;
    currentQuestionIndex = 0;
    score = 0;
    modeSelection.style.display = 'none';
    quizSection.style.display = 'block';
    modeTitle.innerHTML = mode === 'practice' ? 'Modo Práctica' : 'Modo Examen';
    showQuestion();
    if (mode === 'exam') {
        submitButton.style.display = 'inline';
    } else {
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
document.getElementById('practice-mode')?.addEventListener('click', () => startQuiz('practice'));
document.getElementById('exam-mode')?.addEventListener('click', () => startQuiz('exam'));

// Evento para el botón "Siguiente" en modo práctica
nextButton.addEventListener('click', nextQuestion);

// Evento para el botón "Terminar Examen"
submitButton.addEventListener('click', finishQuiz);
