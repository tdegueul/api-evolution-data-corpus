package methodnowthrowscheckedexceptiontestMethodNowThrowsUnchecked;

import testing_lib.methodnowthrowscheckedexceptiontestMethodNowThrowsUnchecked.*;

public class Main extends A {
	@Override public void m() throws Exception {
		super.m();
	}

	public static void main(String[] args) {
		try {
			new A().m();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	/*V1:

public class A {
	public void m() throws Exception {}
}*/
	/*V2:

public class A {
	public void m() throws IllegalArgumentException {}
}*/
	}
}
