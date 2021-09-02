# Übung 1

## Aufgabe 1

### a)

```pascal
methode durchstreichen(a, n)
    i <- a
    while i <= n do
        if not istDurchgestrichen(a)
        then
            durchstreichen(a)
        endif
        i <- a + i
    end for
```

Musterlösung:

```pascal
durchstreichenVielfache(a, n)
    for b ← 2*a to n step a do
        durchstreichen(b)
    end for
```

### b)

Die abstrakte Datenstruktur "Sieb des Eratosthenes" besitzt also die Methoden
hinschreiben, durchstreichen und istDurchgestrichen. Wie könnten
diese Methoden durch eine (aus Einführung in die Programmierung bekannte)
konkrete Datenstruktur in Java realisiert werden?

> Boolean Array

#### hinschreiben

Fülle array mit Inhalt
void (null)

#### durchstreichen

Streicht zahlen aus dem array
void (null)

#### istDurchgestrichen

Prüft ob eine zahl gestrichen ist
boolean

