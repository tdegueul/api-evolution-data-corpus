package testing_lib.exceptionCatchBlockAdd;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCatchBlockAdd {

	public void method1() {
		File file=new File("E://file.txt");
		FileReader fr;
			try {
				fr = new FileReader(file);
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
