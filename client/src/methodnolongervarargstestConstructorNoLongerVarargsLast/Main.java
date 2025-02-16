package methodnolongervarargstestConstructorNoLongerVarargsLast;

import testing_lib.methodnolongervarargstestConstructorNoLongerVarargsLast.*;

public class Main {
	public static void main(String[] args) {
		new A("", 1, 2);
	/*V1:

public class A {
	public A(String s, int... i) {}
}*/
	/*V2:

public class A {
	public A(String s, int i) {}
}*/
	}
}
