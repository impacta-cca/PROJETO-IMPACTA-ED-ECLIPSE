package tad_lista_de_nodos.exception;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {

	public InvalidPositionException(String err) {
		super(err);
	}

}
