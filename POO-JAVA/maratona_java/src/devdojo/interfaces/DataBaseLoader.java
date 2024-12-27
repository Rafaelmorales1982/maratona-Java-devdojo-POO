package devdojo.interfaces;

public class DataBaseLoader implements DataLoader, DataRemover{

	@Override
	public void load() {
	System.out.println("Carregando dados do banco de dados.....");
		
	}

	@Override
	public void remover() {
		System.out.println("Removendo dados do banco de dados");
		
	}

	@Override
	public void checkPermission() {
		System.out.println("Fazendo checagem de permissões do banco de dados");
	}
	
	

}
