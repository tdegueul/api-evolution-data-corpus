package nestedclassnowstatictestDoublyNestedClassNowStatic;

import testing_lib.nestedclassnowstatictestDoublyNestedClassNowStatic.*;

public class Main {
	public static void main(String[] args) {
		new A().new B().new C();
	/*V1:
public class A { public class B { public class C {} } }*/
	/*V2:
public class A { public class B { public static class C {} } }*/
	}
}
