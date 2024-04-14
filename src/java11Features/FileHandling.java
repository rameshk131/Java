package java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {

	public static void main(String[] args) {	
		
		try {
			Path path = Paths.get("./resources/sample.txt");
			String st = Files.readString(path);
			System.out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
