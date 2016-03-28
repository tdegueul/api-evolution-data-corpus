package testing_lib.exceptionTryCatchToThrow;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTryCatchToThrow {

	public void method1() throws IOException {
		File file=new File("E://file.txt");
		FileReader fr = new FileReader(file); 
		fr.close();
	}
	
}
