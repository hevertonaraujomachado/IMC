package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite o seu peso (Kg)?");
		Scanner teclado = new Scanner(System.in);
		
		Float peso = teclado.nextFloat();
		
		System.out.println("Digite a sua altura (M)");
		
		Float altura = teclado.nextFloat();
		
		Float IMC = peso / (altura*altura);
		
		System.out.println("O Seu IMC" + IMC);	

	}

}
