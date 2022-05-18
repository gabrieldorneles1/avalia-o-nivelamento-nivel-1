package produtos;

import java.util.Scanner;


public abstract class Produto {
	
	public static void main(String[] args) {
		Computador comp = new Computador();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o preço: ");		
		double preco = in.nextDouble();
		System.out.println("Informe a quantidade: ");
		double quantidade = in.nextDouble();
		System.out.println("Informe código de barras: ");
		long codigodebarras = in.nextLong();
		
		System.out.println(comp.autenticaCodigo(codigodebarras));
		System.out.println(comp.calcularPreco(preco, quantidade));
	}
	

	public abstract double calcularPreco(double preco, double lucro);

}

