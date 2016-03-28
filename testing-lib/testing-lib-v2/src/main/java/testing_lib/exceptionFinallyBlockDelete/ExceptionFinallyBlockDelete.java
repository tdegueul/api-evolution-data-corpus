package testing_lib.exceptionFinallyBlockDelete;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionFinallyBlockDelete {

	public void method1() {
		File file=new File("E://file.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
