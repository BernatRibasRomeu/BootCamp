# Exercici de prioritats  
\*, .container, href, h1, #titulo, !important  
El pes dels següents selectors és:  
- \* : 0000  
- .container: 0001  
- href: 1000  
- #titulo: 0100
- !important: pes absolut  
El que pesa més és el !important ja que és el que té un oes absolut sobre els altres.  
El que pesa menys es la estrella kleene ja que engloba tots els elements disponibles.  
El ordre de major a menor seria !important(absolut), href(1000), #titulo(id, 0100), .container(class, 0001), estrella kleene(*, 0000).