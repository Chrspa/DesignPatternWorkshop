# DesignPatternWorkshop

Die Aufgaben für den Workshop!

Die aufgaben sind dafür ausgelegt, die Jeweiligen Designpattern für die Lösung Anzuwenden. Alles weitere ist euch voll und ganz überlassen! 
ihr könnt das Projekt herunterladen und benutzen.

-- Aufgabe 1: Leckere Suppe! --

In der ersten Aufgabe geht es darum eine Suppe mit Toppings zu Dekorieren. Dazu werden 3 Toppings zu einen Suppen String hinzugefügt, und als eine Rahmen Suppe erstellt. Die Dekorierer sollen eine weitere Zutat zu der Stringkette hinzufügen
Dazu werden benötigt:

- ein ZutatenInterface,
- ein ZutatenDekorierer,
- spezifische Dekorierer der jeweiligen Toppings,
- eine Suppen Klasse


Die Toppings könnt ihr euch selber aussuchen.

Die ausgabe kann in etwa so aussehen:

"Tonkatsu + Nudeln + Pilze + Bambus Sprossen"

-




-- Aufgabe 2: Ich aber zuerst ! -- 

Bei dieser Aufgabe geht es darum das Singleton pattern Anzuwenden und eine Instanz einer klassen zu erstellen. Diese Klasse soll ausschließlich einmal erzeugt werden, und dann auch nur von einem Thread gleichzeitig bearbeitet werden. 
Unterschiedliche Kinder wollen auf dem Whiteboard Malen, jedoch hat die Mutter gesagt, dass sie sich dabei abwechseln sollen.

Die Klasse hat:

"private static volatile Singleton Whiteboard instanze;"
eine String Liste "geschriebenes"
ein String "whiteboardName"
die Funktion "private Whiteboard(String whiteboardName)", die als getter dient
die Funktion "public static void malen(String wort)", die einen String dem Array hinzufügen soll
die Funktion "public static void schauen()", die auf der Konsole den Inhalt der Liste ausgeben soll
die Funktion "public static Whiteboard getInstance(String whiteboardName)", die die Instanz des Whiteboards zurückgeben soll


die Terminal Ausgaben sind:

"hallo ich bin Tomas ich bin 7 jahre alt!
hallo ich bin Benni ich bin 6 jahre alt!
hallo ich bin Julia ich bin 8 jahre alt!"







(Die Kinder sollten Uhrsprünglich durch mehrere threads auf das Whiteboard zugreifen, jedoch würde die umsetzung im Workshop möglicherweise zu lange dauern, besonders wenn man mittlerweile vielleicht vergessen hat wie Threading in Java Implementiert wird.)




