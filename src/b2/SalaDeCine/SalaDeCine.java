package b2.SalaDeCine;

public class SalaDeCine {

	private final int FILAS = 5;
	private final int COLUMNAS = 5;
	private ClienteSalaDeCine[] miCliente;
	private ClienteSalaDeCine[][] MisAsientos;

	// constructor

	// 1. Crearla con la cantidad de butacas totales, y cantidad de filas

	public SalaDeCine() {
		this.miCliente = new ClienteSalaDeCine[FILAS * COLUMNAS];
		this.MisAsientos = new ClienteSalaDeCine[FILAS][COLUMNAS];
		;
	}

	// 2. Consultar si una butaca está ocupada (referida por fila y asiento)

	// 3. Ocupar una butaca determinada, siempre que ésta no esté previamente
	// ocupada
	public boolean ocuparUnaButacaDeterminada(int fila, int columna, ClienteSalaDeCine nuevoCliente) {
		if(MisAsientos[fila] != null && MisAsientos[columna] != null) {
			MisAsientos[fila][columna] = nuevoCliente;
			return true;
		} else {return false;}}
	
		
	//4. Consultar la cantidad total de butacas ocupadas (tengo que recorrer el array)
	
	public int consultarLaCantidadDeButacasOcupadas() {
	int totalOcupado = 0;
	for (int i = 0; i < MisAsientos.length; i++) {
		for (int j = 0; j < MisAsientos[i].length; j++) {
			if(MisAsientos[i][j] != null) { totalOcupado = totalOcupado + 1;}
	}
	}
		return totalOcupado;
	}
		
	

	// 5. Consultar si es posible acomodar a un grupo de X personas, en forma
	// contigua, en la misma fila:
	
	// TO DO
	// solamente cuenta desde la primer columna de esa fila,
	// Lograr que cuente siempres desde la primer columna vacia, sino es posible, entonces calcular desde la siguiente colu,na vacia. 
	
	public boolean consultarSiEsPosibeAcomodorEnunMismaFila(int fila, int grupo) {
		
		int lugaresLibres=0;
		boolean esPosibleAcomodarEnfilaes;
		
		for (int i = 0; i < MisAsientos[fila].length; i++) {
			if(MisAsientos[fila][i] == null) {
				lugaresLibres = lugaresLibres +1;
			}
		}
		if(lugaresLibres == fila) {esPosibleAcomodarEnfilaes = true;} else {esPosibleAcomodarEnfilaes=false;}
		return esPosibleAcomodarEnfilaes;
	}
	
	
	
	
	
	
	
	

}
