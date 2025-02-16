package typeremovedtestClassInnerStaticProtectedInClassPublicRemoved;

import testing_lib.typeremovedtestClassInnerStaticProtectedInClassPublicRemoved.*;

public class Main extends A {
	void m() {
		A.I i = null;
	}
	public static void main(String[] args) {
		A.I i = null;
	/*V1:

public class A {
  static protected class I {}
}*/
	/*V2:

public class A {
  static protected class J {}
}*/
	}
}
