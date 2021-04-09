package Aula1;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("Sua media final é: %.2f", media);
	}

}
