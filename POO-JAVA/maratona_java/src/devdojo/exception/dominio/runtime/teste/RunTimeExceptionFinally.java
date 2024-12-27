package devdojo.exception.dominio.runtime.teste;

public class RunTimeExceptionFinally {

	public static void main(String[] args) {
 abreConexao();

	}

	private static String abreConexao() {
		
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
		return "Conexão Aberta";
		}catch(Exception e) {
		
			e.printStackTrace();
		}finally {
			System.out.println("Fechando o arquivo");
		}
		return null;
	}

}
