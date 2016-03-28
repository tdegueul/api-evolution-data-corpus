package testing_lib.exceptionThrowToTryCatch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionThrowToTryCatch {

	public void method1() throws IOException {
		File file=new File("E://file.txt");
		FileReader fr = new FileReader(file); 
		fr.close();
	}
	
}
