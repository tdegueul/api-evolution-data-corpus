package methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsTypeParameter;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsTypeParameter.*;

public class Main extends A {
	@Override public <T extends Exception> void m() throws T {
		super.m();
	}

	public static void main(String[] args) {
		new A().m();
		new A().<IllegalArgumentException>m();

		try {
			new A().m();
			new A().<IllegalArgumentException>m();
		} catch (Exception e) {

		}
	/*V1:

public class A {
	public <T extends Exception> void m() throws T {}
}*/
	/*V2:

public class A {
	public <T extends Exception> void m() {}
}*/
	}
}
