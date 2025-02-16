package classnowcheckedexceptiontestUncheckedExceptionBecomesCheckedException;

import testing_lib.classnowcheckedexceptiontestUncheckedExceptionBecomesCheckedException.*;

public class Main {
	public static void main(String[] args) {
		try {
			throw new A();
		} catch (RuntimeException e) {

		}
	/*V1:
public class A extends RuntimeException {}*/
	/*V2:
public class A extends Exception {}*/
	}
}
