# Übung 2

## Aufgabe 1

n = 100

```java
void proz1(int n) {
    for (int a = 0; a < n; a++)
        tuwas();
    for (int b = 0; b < n; b++)
        tuwas();
}
// n_tuwas = 200
// O(n + n) = O(2n)

void proz2(int n) {
    for (int a = 0; a < n; a++)
        for (int b = 0; b < n; b++)
            tuwas();
}
// n_tuwas = 100*100 = 10000
// O(n*n) = O(n^2)

void proz3(int n) {
    for (int a = 0; a * a <= n; a++)
        tuwas();
}
// n_tuwas = sqrt(n) = 10
// O(sqrt(n)) = O(n^(1/2))

void proz4(int n) {
    for (int a = 1; a <= 100; a++) // nicht abhängig von n!
        for (int b = 1; b < n * n; b++)
            for (int c = 1; c < n; c++)
                tuwas();
}

// n_tuwas = 100 * (100 * 100 - 1) * 99 = 98990100
// O(100 * (n*n-1) * (n-1)) = O(n^3)

void proz5(int n) {
    for (int a = 1; a <= n; a++)
        for (int b = 1; b <= a; b++)
            tuwas();
}
// n_tuwas = sum_i=0^100(i) = 5050
// Nach Induktin gilt sum_i=0^100(i) = n(n+1)/2
// O(n(n+1)/2) = O(n^2)

void proz6(int n) {
    while (n >= 1) {
        tuwas();
        n /= 2;
    }
}
// n_tuwas = roundUp(log_2(n)) = 7
// O(log_2(n))
```


### Aufgabe 1c

```latex
proz1:
f(n)=O(g(n))=O(n)
proz2:
f(n)=O(g(n))=O(n^2)
proz3:
f(n)=O(g(n))=O(n^(1/2))
proz4:
f(n)=O(g(n))=O(n^4)
proz5:
f(n)=O(g(n))=O(n^2)
proz6:
f(n)=O(g(n))=O(log(n))
```

---

## Aufgabe 2

Allgemein berechnet man: lim(f(n)/g(n)) und prüft auf Grenzwerte
- Existiert ein Grenzwert, so gilt f=O(g)
- Divergiert bestimmt, d.h. , dann gilt f≠O(g)
- Divergiert unbestimmt, so muss man prüfen, ob es eine obere Schranke gibt.

### Aufgabe 2.1

Die Aussage ist falsch, denn lim_n->∞(7n*log_2(n)/n) divergiert bestimmt gegen ∞

### Aufgabe 2.2

Richtig, konviergiert gegen 1

### Aufgabe 2.3

Richtig, divergiert unbestimmt, obere Schranke = 9

### Aufgabe 2.4

Richtig, da O(n^2) in O(n^3) liegt

---

## Aufgabe 3

### Aufgabe 3.1

A2 besser als A1 für n's bis 16. Gleich gut bei n = 16.

A3 besser als A1 bis n = 8. Gleich gut bei 8. A1 besser als A3 für n > 8.

A3 besser als A2 bis n = 6. Gleich gut bei 6. A2 besser als A3 für n > 6.
