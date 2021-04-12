# Übung 1

## Aufgabe 1

### a

```pseudo
methode durchstreichen(a, n)
    i <- a
    while a <- n do
        if not istDurchgestrichen(a)
        then
            durchstreichen(a)
        endif
        a <- a + i
    end while
```

### b

Die abstrakte Datenstruktur "Sieb des Eratosthenes" besitzt also die Methoden
hinschreiben, durchstreichen und istDurchgestrichen. Wie könnten
diese Methoden durch eine (aus Einführung in die Programmierung bekannte)
konkrete Datenstruktur in Java realisiert werden?

#### hinschreiben

Fülle array mit Inhalt
void (null)

#### durchstreichen

Streicht zahlen aus dem array
void (null)

#### istDurchgestrichen

Prüft ob eine zahl gestrichen ist
boolean
