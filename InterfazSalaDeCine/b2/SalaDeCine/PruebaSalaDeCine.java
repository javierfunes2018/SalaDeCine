package b2.SalaDeCine;

import java.util.Scanner;

public class PruebaSalaDeCine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bienvenido
		
		System.out.println("Sistema Activo");
		
		// creo los asientos
		
		SalaDeCine miCine = new SalaDeCine();
	
		// creo el teclado
		
		Scanner teclado = new Scanner(System.in);
		
		// variable encendido
		
		boolean encendido = true;
		
		// Menu
		
		while (encendido) {
			
		// opciones
			System.out.println("--> 1- ocupar una butaca");
			System.out.println("--> 2- consultar butaca ocupadas");
			System.out.println("--> 3- consultar si es posible acomodar un grupo de personas en un fila");
			System.out.println("--> 4- Desactivar sistema");
			
			// ingreso de opcion
			
			
			int opcion = teclado.nextInt();
			
			
			// switch
			switch (opcion) {
			case 1:
				// solicito fila y columna
				System.out.println("Indique la fila: ");
				int fila = teclado.nextInt();
				System.out.println("Indique la columna");
				int columan= teclado.nextInt();
				
				// solicita datos del cliente
				System.out.println("Indicar el nombre");
				String nombreDelCliente = teclado.next();
				System.out.println("Indicar el Dni");
				int dniDelCliente = teclado.nextInt();
				
				ClienteSalaDeCine nuevoCliente = new ClienteSalaDeCine();
				nuevoCliente.setClienteCine(null);
				nuevoCliente.setDni(opcion);
				
				miCine.ocuparUnaButacaDeterminada(fila, columan, nuevoCliente);
				
				
				break;
			
			case 2:
				int totalOcupado = miCine.consultarLaCantidadDeButacasOcupadas();
				System.out.println("Se ha ocupado butacas "+totalOcupado);
				
				break;
			
			case 3:
				System.out.println("Indicar la cantidad de personas que quisieras agregar");
				int cantidadPersonas = teclado.nextInt();
				
				System.out.println("Indicar la fila que quisieras saber si es posible colocarlos a todos");
				int filaCalcular=  teclado.nextInt();
				
				boolean esPosible = miCine.consultarSiEsPosibeAcomodorEnunMismaFila(filaCalcular, cantidadPersonas);
				
				String text;
				
				if (esPosible) {
					text = "Sí, sí es posible colocar a las "+cantidadPersonas+" en la fila " +filaCalcular;
				} else {
					text = "No, no es posible colocar a las "+cantidadPersonas+" en la fila " +filaCalcular;
				}
				
				System.out.println(text);
				
				break;

			case 4:
				System.out.println("------Desactivado----------");
				encendido = false;
				break;
	
			}
			
			
			
			
		}
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
