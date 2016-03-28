package testing_lib.exceptionFinallyBlockAdd;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionFinallyBlockAdd {

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
