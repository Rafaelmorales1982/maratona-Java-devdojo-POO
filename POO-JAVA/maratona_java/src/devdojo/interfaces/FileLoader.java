package devdojo.interfaces;

public class FileLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Carregando dados do arquivo....");
		
	}

	@Override
	public void remover() {
		System.out.println("Removendo dados do arquivo");
		
	}

	@Override
	public void checkPermission() {
		System.out.println("Fazendo checagem de permissões do arquivo");
	}
	
	
	

}
