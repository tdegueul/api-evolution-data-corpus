package classnowcheckedexceptiontestSpecificExceptionBecomesGeneric;

import testing_lib.classnowcheckedexceptiontestSpecificExceptionBecomesGeneric.*;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			throw new A();
		} catch (IOException e) {

		}
	/*V1:
public class A extends java.io.IOException {}*/
	/*V2:
public class A extends Exception {}*/
	}
}
