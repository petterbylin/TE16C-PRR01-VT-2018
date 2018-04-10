# JavaFX
### Ni f�r mer �n g�rna anv�nda Github till denna uppgift!

### 1. Raket
1. Skapa en class Raket som �rver classen Group.
    - En Raket ska n�gorlunda se ut som en raket och ha en avl�ng kropp med spetsig nos och tv� vingar p� sidan.
    - En Raket ska kunna rotera h�ger och v�nster samt flyga fram�t i den riktning den pekar.
    - En Raket ska �ven ha en metod d�r man kan sl� p� och av en hyperdrive som g�r att man �ker snabbare.
    - Raketen ska p� n�got s�tt indikera n�r hyperdriven �r p� eller av. *(Exempelvis �ndra f�rg)*
    
2. Skapa en ny Raket i ett f�nster och g�r s� att man kan �ka runt och styra raketen med l�mpliga knappar.

### 2. Studsboll
1. Skapa en class Studsboll som �rver classen Circle.
    - Ett objekt av typen Studsboll ska ha en hastighet som alltid b�rjar p� 0.
    - En Studsboll ska ha en metod *fall()* som g�r att dess hastighet �ndras med en positiv konstant samt att dess placering �ndras med sin hastighet.
    - N�r bollen nuddar marken ska hastigheten byra riktning.
    - I classen Studsboll ska det finnas en statisk ArrayList som inneh�ller Studsbollar. Varje g�ng en ny studsboll skapas s� ska den l�ggas till i ArrayListen.
    - Classen Studsboll ska ha en statisk metod som **bara kan anropas en enda g�ng** och dess syfte �r att den ska skapa en AnimationTimer som loopar igenom ArrayListen med Studsbollar och se till att alla Studsbollar alltid faller.
    
2. Skapa 10 st Studsbollar i olika storlekar som studsar runt i ett f�nster.

3. **BONUS:** L�gg till s� att en Studsboll skapas med en slumpad hastighet i x-led och att den alltid flyttas i sidled och byter riktning n�r den kommer till en sidokant.

### 3. **BONUS-BONUS** L�gg till i din Raket s� att den kan skjuta en projektil som �r en Circle rakt fram�t.

### N�r ni �r klara ska ni skicka in dessa tv� classer tillsammans med en eller tv� Applications d�r man kan se era classer in action.