package methodnowthrowscheckedexceptiontestMethodNowThrowsIndirect;

import testing_lib.methodnowthrowscheckedexceptiontestMethodNowThrowsIndirect.*;

public class Main {
	public static void main(String[] args) {
		new B().m();
	/*V1:

public class A {
	public void m() {}
}
public class B extends A {}*/
	/*V2:

public class A {
	public void m() throws Exception {}
}
public class B extends A {}*/
	}
}
