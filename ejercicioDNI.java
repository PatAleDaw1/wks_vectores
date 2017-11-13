import java.util.Scanner;
public class ejercicioDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nif;
		String nifNueva = "";
		char vectorLetras [] = { 'T', 'R', 'W','A', 'G', 'M', 'Y', 'F', 'P',
				'D', 'X', 'B', 'N', 'J','Z','S','Q','V', 'H', 'L', 'C', 'K', 'E'};
		Scanner teclado = new Scanner(System.in);
		final int MAX = 9;
		int nifint;
		do {
			System.out.println("Introducir NIF");
			nif= teclado.nextLine();

		}while (nif.length() != MAX);
		while (nif.charAt(0) >='0' && nif.charAt(0) <='9' || nif.charAt(0) == 'X' ||
				nif.charAt(0) == 'Y' || nif.charAt(0) == 'Z'){

			if(nif.startsWith ("X"));
				nifNueva = nif.replaceFirst("X", "0");

			if (nif.startsWith("Y"));
				nifNueva = nif.replaceFirst("Y", "1");
			
			if (nif.startsWith("Z"));
				nifNueva = nif.replaceFirst("Z", "2");
		
			
				
			}
System.out.println(nifNueva);
		}
	
	}

/* Cuando arregles lo de reemplazar y quede todo en números: Pasar el string a int
después el int NIF (numero)  /  23, el numero que salga MOD = loquesea, ese loquesea
es el resto que usaremos para reemplazar por la letra del vector char*/



