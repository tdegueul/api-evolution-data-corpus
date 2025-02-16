package classnowcheckedexceptiontestClassBecomesSpecificCheckedException;

import testing_lib.classnowcheckedexceptiontestClassBecomesSpecificCheckedException.*;

public class Main extends A {
	public static void main(String[] args) {
		A a = new A();
	/*V1:
public class A {}*/
	/*V2:
public class A extends java.io.IOException {}*/
	}
}
