package methodnowthrowscheckedexceptiontestMethodNowThrows;

import testing_lib.methodnowthrowscheckedexceptiontestMethodNowThrows.*;

public class Main {
	public static void main(String[] args) {
		new A().m();
	/*V1:

public class A {
	public void m() {}
}*/
	/*V2:

public class A {
	public void m() throws Exception {}
}*/
	}
}
