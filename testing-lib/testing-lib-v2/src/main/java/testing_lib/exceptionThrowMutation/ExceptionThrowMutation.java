package testing_lib.exceptionThrowMutation;

import java.io.FileNotFoundException;

public class ExceptionThrowMutation {

	public void method1() throws FileNotFoundException {
		throw new StringIndexOutOfBoundsException();
	}
	
}
