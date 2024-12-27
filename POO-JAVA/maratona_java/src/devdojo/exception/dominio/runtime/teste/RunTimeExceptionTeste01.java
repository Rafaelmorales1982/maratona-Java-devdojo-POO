package devdojo.exception.dominio.runtime.teste;

public class RunTimeExceptionTeste01 {

	public static void main(String[] args) {
	//Checked(checadas filhas Exception) e Unchecked(não checadas filhas RunTimeException)
   divisao(0, 1);
	}
	
	private static int divisao(int a, int b) throws IllegalArgumentException {
	if(b == 0 || a == 0) {
		throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
	}
	return a / b;
	}


}