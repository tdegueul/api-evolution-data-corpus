package nestedclassnolongerstatictestNestedClassInInterfaceNoLongerStatic;

import testing_lib.nestedclassnolongerstatictestNestedClassInInterfaceNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		new A.B();
	/*V1:
public interface A { public static class B {} }*/
	/*V2:
public interface A { public class B {} }*/
	}
}
