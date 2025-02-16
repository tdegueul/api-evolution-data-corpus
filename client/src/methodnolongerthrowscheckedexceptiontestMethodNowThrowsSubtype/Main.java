package methodnolongerthrowscheckedexceptiontestMethodNowThrowsSubtype;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNowThrowsSubtype.*;

public class Main extends A {
	@Override public void m() throws Exception {
		super.m();
	}

	public static void main(String[] args) {
		try {
			new A().m();
		} catch (Exception e) {

		}
	/*V1:

public class A {
	public void m() throws Exception {}
}*/
	/*V2:

public class A {
	public void m() throws java.io.IOException {}
}*/
	}
}
