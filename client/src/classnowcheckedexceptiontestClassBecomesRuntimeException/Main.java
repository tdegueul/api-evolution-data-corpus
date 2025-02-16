package classnowcheckedexceptiontestClassBecomesRuntimeException;

import testing_lib.classnowcheckedexceptiontestClassBecomesRuntimeException.*;

public class Main extends A {
	public static void main(String[] args) {
		A a = new A();
	/*V1:
public class A {}*/
	/*V2:
public class A extends RuntimeException {}*/
	}
}
