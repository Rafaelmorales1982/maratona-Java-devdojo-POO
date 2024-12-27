package devdojo.interfaces;

public interface DataLoader {
	
	public static final int MAX_DATA_SIZE = 10;
	
	public abstract void load();
	public default void checkPermission() {
		System.out.println("Fazendo checagem de permissões.....");
	}
	
	public static void dentroMaxDataSize() {
		System.out.println("Dentro 'entroMaxDataSize' na interface e tamanho .::"+MAX_DATA_SIZE);
	}

}
