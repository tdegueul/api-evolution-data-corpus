package methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsUnchecked;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsUnchecked.*;

public class Main extends A {
	@Override public void m() throws RuntimeException {
		super.m();
	}

	public static void main(String[] args) {
		new A().m();

		try {
			new A().m();
		} catch (RuntimeException e) {

		}
	/*V1:

public class A {
	public void m() throws RuntimeException {}
}*/
	/*V2:

public class A {
	public void m() {}
}*/
	}
}
