package classnowcheckedexceptiontestCheckedExceptionBecomesSpecific;

import testing_lib.classnowcheckedexceptiontestCheckedExceptionBecomesSpecific.*;

public class Main extends A {
	public static void main(String[] args) {
		try {
			throw new A();
		} catch (A e) {

		} catch (Exception e) {

		}
	/*V1:
public class A extends Exception {}*/
	/*V2:
public class A extends java.io.IOException {}*/
	}

	public void m() throws A {

	}
}
