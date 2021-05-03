public class Stack<E> implements StackI<E>
{
	// Array, in dem die Elemente des Stacks gespeichert werden.
	// Das oberes Ende des Stacks liegt an Position pos-1.
	// Ein Array mit Elementen vom Typ E kann zwar deklariert, aber
	// nicht �ber new erzugt werden (Java-Mangel)!
	private Object[] st;

	// N�chste freie Position im Array
	// Gleichzeitig Anzahl der im Array/Stack gespeicherten Elemente
	private int pos;

	// Erzeugt ein Stack-Objekt, in dem maximal size Elemente
	// abgespeichert werden k�nnen
	public Stack(int size)
	{
		st = new Object[size];
	}

	// Legt �bergebenes Element auf den Stack, sofern noch Platz
	// vorhanen ist. Das Element wird an Position pos gespeichert.
	public void push(E element)
	{
		// TODO
	}

	// Holt oberstes Element vom Stack, sofern der Stack nicht leer ist.
	public void pop()
	{
		// TODO
	}

	// Gibt oberstes Element auf dem Stack zur�ck, sofern der Stack nicht
	// leer ist. Bei leerem Stack wird null zur�ckgegeben.
	public E top()
	{
		// TODO
	}

	// Gibt true zur�ck, falls der Stack leer ist
	public boolean isEmpty()
	{
		// TODO
	}
}