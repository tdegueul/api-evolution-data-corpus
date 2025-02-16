package nestedclassnolongerstatictestNestedClassNoLongerStatic;

import testing_lib.nestedclassnolongerstatictestNestedClassNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		new A.B();
	/*V1:
public class A { public static class B {} }*/
	/*V2:
public class A { public class B {} }*/
	}
}
