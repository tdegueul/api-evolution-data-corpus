package methodnowthrowscheckedexceptiontestMethodNowThrowsIndirectWithOverrideWithoutThrows;

import testing_lib.methodnowthrowscheckedexceptiontestMethodNowThrowsIndirectWithOverrideWithoutThrows.*;

public class Main extends B {
	@Override public void m() {
		super.m();
	}

	public static void main(String[] args) {
		new A().m();
		new B().m();
	/*V1:

public class A {
	public void m() {}
}
public class B extends A {
	@Override public void m() {}
}*/
	/*V2:

public class A {
	public void m() throws Exception {}
}
public class B extends A {
	@Override public void m() {}
}*/
	}
}
