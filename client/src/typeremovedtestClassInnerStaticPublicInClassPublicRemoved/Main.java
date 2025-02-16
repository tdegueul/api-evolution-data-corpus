package typeremovedtestClassInnerStaticPublicInClassPublicRemoved;

import testing_lib.typeremovedtestClassInnerStaticPublicInClassPublicRemoved.*;

public class Main {
	public static void main(String[] args) {
		A.I i = new A.I();
	/*V1:

public class A {
  public static class I {}
}*/
	/*V2:

public class A {
  public static class J {}
}*/
	}
}
