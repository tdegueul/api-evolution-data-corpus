package nestedclassnowstatictestNestedClassNowStatic;

import testing_lib.nestedclassnowstatictestNestedClassNowStatic.*;

public class Main {
	public static void main(String[] args) {
		new A().new B();
	/*V1:
public class A { public class B {} }*/
	/*V2:
public class A { public static class B {} }*/
	}
}
