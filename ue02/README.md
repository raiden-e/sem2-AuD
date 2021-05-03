# Übung 2

## Aufgabe 1

### Aufgabe 1a

```java
int n = 100;
proz1(n);
// 200
proz2(n);
// 10000
proz3(n);
// 11
proz4(n);
// 100 * 9999 * 99 = 98990100
proz5(n);
// sum_1^100(n)
proz6(n);
// 7
```

### Aufgabe 1b

```latex
f(n) = 2n

f(n) = n^2

f(n) = sqrt(n)+1

f(n) = n * (n^2-1) * (n - 1)

f(n) = sum_1^100(n)

f(n) = rnd(log_2(n)) + 1
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

### Aufgabe 2.1

Richtig da lim(7n * log_2(n) / n) bestimmt konviergiert

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
