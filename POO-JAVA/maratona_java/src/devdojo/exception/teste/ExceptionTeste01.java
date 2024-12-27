package devdojo.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {

	public static void main(String[] args) {
		
		criarNovoArquivo();
	}
	
	private static void criarNovoArquivo() {
		File file = new File("arquivo\\teste2.txt");
		try {
		boolean criado = 	file.createNewFile();
	
		System.out.println("Arquivo criado .::"+criado);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
