package devdojo.exception.teste;
import java.io.File;
import java.io.IOException;


public class ExceptionCriandoArquivo {




	public static void main(String[] args) throws IOException{
		
		criarNovoArquivo();
	}
	
	public static void criarNovoArquivo() throws IOException {
		File file = new File("arquivo\\teste2.txt");
		try {
		boolean criado = 	file.createNewFile();
	
		System.out.println("Arquivo criado .::"+criado);
		}
		catch(IOException e) {
			e.printStackTrace();
			throw e;
//			throw new RuntimeException("Problema na hora de criar o arquivo....");
		}
		
	}

}
