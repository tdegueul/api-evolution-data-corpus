package methodnolongerstatictestMethodNoLongerStatic;

import testing_lib.methodnolongerstatictestMethodNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		A.m();
	/*V1:

public class A {
	public static void m() {}
}*/
	/*V2:

public class A {
	public void m() {}
}*/
	}
}
