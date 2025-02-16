package methodnolongerthrowscheckedexceptiontestMethodNoLongerThrows;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNoLongerThrows.*;

import java.io.IOException;

public class Main extends A {
	public void t() throws Exception {
		new A().m();
	}

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
	public void m() {}
}*/
	}
}
