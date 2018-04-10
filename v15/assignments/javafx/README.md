# JavaFX
### Ni får mer än gärna använda Github till denna uppgift!

### 1. Raket
1. Skapa en class Raket som ärver classen Group.
    - En Raket ska någorlunda se ut som en raket och ha en avlång kropp med spetsig nos och två vingar på sidan.
    - En Raket ska kunna rotera höger och vänster samt flyga framåt i den riktning den pekar.
    - En Raket ska även ha en metod där man kan slå på och av en hyperdrive som gör att man åker snabbare.
    - Raketen ska på något sätt indikera när hyperdriven är på eller av. *(Exempelvis ändra färg)*
    
2. Skapa en ny Raket i ett fönster och gör så att man kan åka runt och styra raketen med lämpliga knappar.

### 2. Studsboll
1. Skapa en class Studsboll som ärver classen Circle.
    - Ett objekt av typen Studsboll ska ha en hastighet som alltid börjar på 0.
    - En Studsboll ska ha en metod *fall()* som gör att dess hastighet ändras med en positiv konstant samt att dess placering ändras med sin hastighet.
    - När bollen nuddar marken ska hastigheten byra riktning.
    - I classen Studsboll ska det finnas en statisk ArrayList som innehåller Studsbollar. Varje gång en ny studsboll skapas så ska den läggas till i ArrayListen.
    - Classen Studsboll ska ha en statisk metod som **bara kan anropas en enda gång** och dess syfte är att den ska skapa en AnimationTimer som loopar igenom ArrayListen med Studsbollar och se till att alla Studsbollar alltid faller.
    
2. Skapa 10 st Studsbollar i olika storlekar som studsar runt i ett fönster.

3. **BONUS:** Lägg till så att en Studsboll skapas med en slumpad hastighet i x-led och att den alltid flyttas i sidled och byter riktning när den kommer till en sidokant.

### 3. **BONUS-BONUS** Lägg till i din Raket så att den kan skjuta en projektil som är en Circle rakt framåt.

### När ni är klara ska ni skicka in dessa två classer tillsammans med en eller två Applications där man kan se era classer in action.