import java.util.Scanner;

public class IsPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	int numero;
	boolean resultado;
	
	System.out.println("Digite um n�mero:");
	numero = entrada.nextInt();
	
	resultado = IsPar(numero);
	
	if (resultado) {
		System.out.println("O n�mero � par");
	} else {
	System.out.println("O numero � Impar");	}
	}
	
	static boolean IsPar (int numero) {
		if (numero % 2 == 0)
			return true;
			return false;
	}
}
