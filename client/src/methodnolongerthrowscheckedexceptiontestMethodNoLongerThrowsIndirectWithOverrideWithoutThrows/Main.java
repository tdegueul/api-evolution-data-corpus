package methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsIndirectWithOverrideWithoutThrows;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNoLongerThrowsIndirectWithOverrideWithoutThrows.*;

public class Main extends A {
	@Override public void m() throws Exception {
		super.m();
	}

	void t() throws Exception {
		new A().m();
		new B().m();
	}

	public static void main(String[] args) {
		try {
			new A().m();
		} catch (Exception e) {

		}
		new B().m();
	/*V1:

public class A {
	public void m() throws Exception {}
}
public class B extends A {
	@Override public void m() {}
}*/
	/*V2:

public class A {
	public void m() {}
}
public class B extends A {
	@Override public void m() {}
}*/
	}
}
