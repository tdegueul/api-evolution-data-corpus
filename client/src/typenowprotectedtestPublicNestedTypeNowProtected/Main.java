package typenowprotectedtestPublicNestedTypeNowProtected;

import testing_lib.typenowprotectedtestPublicNestedTypeNowProtected.*;

public class Main {
	public static void main(String[] args) {
		A.B a = new A().new B();
	/*V1:
public class A { public class B {} }*/
	/*V2:
public class A { protected class B {} }*/
	}
}
