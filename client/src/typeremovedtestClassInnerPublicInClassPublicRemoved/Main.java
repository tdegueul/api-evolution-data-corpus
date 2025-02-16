package typeremovedtestClassInnerPublicInClassPublicRemoved;

import testing_lib.typeremovedtestClassInnerPublicInClassPublicRemoved.*;

public class Main {
	public static void main(String[] args) {
		new A().new I();
	/*V1:

public class A {
  public class I {}
}*/
	/*V2:

public class A {
  public class J {}
}*/
	}
}
