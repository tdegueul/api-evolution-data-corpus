package methodnolongerthrowscheckedexceptiontestMethodNowThrowsSupertype;

import testing_lib.methodnolongerthrowscheckedexceptiontestMethodNowThrowsSupertype.*;

import java.io.IOException;

public class Main extends A {
	@Override public void m() throws IOException {
		super.m();
	}

	public static void main(String[] args) {
		try {
			new A().m();
		} catch (IOException e) {

		}
	/*V1:

public class A {
	public void m() throws java.io.IOException {}
}*/
	/*V2:

public class A {
	public void m() throws Exception {}
}*/
	}
}
