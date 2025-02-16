package typeremovedtestClassInnerProtectedInClassPublicRemoved;

import testing_lib.typeremovedtestClassInnerProtectedInClassPublicRemoved.*;

public class Main extends A {
	void m() {
		I i = null;
	}

	public static void main(String[] args) {
		I i = null;
		new Main().m();
	/*V1:

public class A {
  protected class I {}
}*/
	/*V2:

public class A {
  protected class J {}
}*/
	}
}
