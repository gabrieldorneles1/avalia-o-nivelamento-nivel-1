package produtos;

public class Computador extends Produto implements Autenticacao{ 

	public static void main(String[] args) {
		

	}
	
	

	@Override
	public double calcularPreco(double preco, double lucro) {
		return preco + lucro;
	}



	@Override
	public boolean autenticaCodigo(long codigoDeBarras) {
		if(codigoDeBarras == 111222333)
			return true;
		else
			return false;
	}

}
