package nestedclassnowstatictestNestedClassInInterfaceNowStatic;

import testing_lib.nestedclassnowstatictestNestedClassInInterfaceNowStatic.*;

public class Main {
	public static void main(String[] args) {
		new A.B();
	/*V1:
public interface A { public class B {} }*/
	/*V2:
public interface A { public static class B {} }*/
	}
}
