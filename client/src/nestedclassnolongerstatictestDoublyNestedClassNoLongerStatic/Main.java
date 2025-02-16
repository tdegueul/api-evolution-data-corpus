package nestedclassnolongerstatictestDoublyNestedClassNoLongerStatic;

import testing_lib.nestedclassnolongerstatictestDoublyNestedClassNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		new A.B.C();
	/*V1:
public class A { public class B { public static class C {} } }*/
	/*V2:
public class A { public class B { public class C {} } }*/
	}
}
