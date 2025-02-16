package methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsIndirect;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsIndirect.*;

public class Main extends B {
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
}
public class B extends A {}*/
	/*V2:

public class A {
	public void m() {}
}
public class B extends A {}*/
	}
}
