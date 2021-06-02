package tad_fila_array.classes;

import tad_fila_array.exception.EmptyQueueException;
import tad_fila_array.exception.FullQueueException;
import tad_fila_array.interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {

	protected E Q[]; // Arranjo usado para implementar a pilha
	protected int N;

	int r = 0;
	int f = r;

	@SuppressWarnings("unchecked")

	public ArrayQueue(int N) {
		this.N = N;
		Q = (E[]) new Object[N];
	}

	@Override
	public int size() {
		return (N - f + r) % N;
	}

	@Override
	public boolean isEmpty() {
		if (r == f) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public E front() throws EmptyQueueException {
		if (isEmpty() == true)
			throw new EmptyQueueException("Queue is empty.");
		return Q[f];
	}

	@Override
	public void enqueue(E element) throws FullQueueException {
		if (size() == N - 1)
			throw new FullQueueException("Queue is full.");

		Q[r] = element;
		r = (r + 1) % N;

	}

	@Override
	public E dequeue() throws EmptyQueueException {
		if (isEmpty() == true)
			throw new EmptyQueueException("Queue is empty.");

		E temp = Q[f];
		Q[f] = null;
		f = (f + 1) % N;

		return temp;
	}

	//necessario corrigir o print para não printar o null
	public String toString() {

		String s;

		s = "[";

		if (size() > 0) {
			boolean primeiro = false;
			for (int i = 0; i <= size()+1 ; i++) {
				if(Q[i]!=null) {
				if(primeiro == false) {
					s+=Q[i];
					primeiro = true;
				}
				else {
					s+=" ,"+Q[i];
				}
				
				}

			}

		}

		return s + "]";

	}

}