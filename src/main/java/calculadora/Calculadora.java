package calculadora;

public class Calculadora {
	

	
	/**
	 * Este método soma dois inteiros e retorna o resultado
	 * 
	 * @param a
	 * 	 Primeiro valor a ser adicionado
	 * @param b
	 * 	Segundo valor a ser adicionado
	 * @return O valor retornado é a soma dos dois nxmeros
	 */
	public int soma (int a, int b) {
		return a + b;
	}
	
	/**
	 * Este mxtodo subtrai dois inteiros e retorna o resultado
	 * 
	 * @param a
	 * 	 Primeiro valor a ser subtraxdo
	 * @param b
	 * 	Segundo valor a ser subtraxdo
	 * @return O valor retornado x a subtraxxo dos dois nxmeros
	 */	
	public int subtracao(int a, int b) {
		return a - b;
	}
	
	/**
	 * Este mxtodo multiplica dois inteiros e retorna o resultado
	 * 
	 * @param a
	 * @param b
	 * @return 
	 */		
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	
	/**
	 * Este mxtodo divide dois inteiros e retorna o resultado
	 * 
	 * @param a
	 * @param b
	 * @return 
	 * */	
	public int divisao(int a, int b) {
		return a / b;
	}	

	/**
	 * Este mxtodo retorna o somatxrio 0 atx n
	 * 
	 * @param n	  		
	 * @return O retorno serx o somatxrio de 0 atx n
	 */
	public int somatoria(int n) {
		int somatorio = 0;
		while (n >= 0) {
			somatorio += n;
			n--;
		}
		return somatorio;
	}
	
	
	/**
	 * Este retorna se um inteiro n x positivo
	 * 
	 * @param n	 
	 * @return
	 */	
	public boolean ehPositivo(int n) {
		return n >= 0;
	}
	
	/**
	 * Esse mxtodo compara dois nxmero a e b
	 * @param a
	 * @param b
	 * @return 0 se a==b, 1 se a>b, -1 se a < b
	 */
	public int compara(int a, int b) {
		int retorno = 0;
		if (a==b) {
			retorno = 0;			
		} else if (a > b) {
			retorno = 1;
		} else {
			retorno = -1;
		}
		return retorno;		
	}
	
	
}
