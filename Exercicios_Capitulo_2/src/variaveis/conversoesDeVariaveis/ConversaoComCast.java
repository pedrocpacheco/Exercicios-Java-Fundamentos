package variaveis.conversoesDeVariaveis;

public class ConversaoComCast {

	public static void main(String[] args) {
		
		int inteiro = 10;
		
		float flutuante  = inteiro; // não precisa do casting, pois float > int
		System.out.println(flutuante);
		
	
		int novoInteiro  = (int) flutuante; // precisa do casting, pois int < float		
		System.out.println(novoInteiro);

		int outroInteiro = (int) flutuante; // precisa do casting, pois int < float		
		System.out.println(outroInteiro);
		
	}
}
