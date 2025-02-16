package classnowcheckedexceptiontestSpecificUncheckedExceptionBecomesSpecificCheckedException;

import testing_lib.classnowcheckedexceptiontestSpecificUncheckedExceptionBecomesSpecificCheckedException.*;

public class Main {
	public static void main(String[] args) {
		try {
			throw new A();
		} catch (IllegalArgumentException illegalargumentexception) {

		}
	/*V1:
public class A extends IllegalArgumentException {}*/
	/*V2:
public class A extends java.io.IOException {}*/
	}
}
