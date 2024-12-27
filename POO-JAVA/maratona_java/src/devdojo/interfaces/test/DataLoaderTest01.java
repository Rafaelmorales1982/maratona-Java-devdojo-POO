package devdojo.interfaces.test;

import devdojo.interfaces.DataBaseLoader;
import devdojo.interfaces.DataLoader;
import devdojo.interfaces.FileLoader;

public class DataLoaderTest01 {

	public static void main(String[] args) {
		DataBaseLoader databaseloader = new DataBaseLoader();
		FileLoader fileloader = new FileLoader();
		
		databaseloader.load();
		fileloader.load();
		databaseloader.remover();
		fileloader.remover();
		fileloader.checkPermission();
		databaseloader.checkPermission();
		
		DataLoader.dentroMaxDataSize();
		
	}

}
