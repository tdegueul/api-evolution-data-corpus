package methodnolongervarargstestConstructorNoLongerVarargsFirst;

import testing_lib.methodnolongervarargstestConstructorNoLongerVarargsFirst.*;

public class Main {
	public static void main(String[] args) {
		new A(0, 1);
	/*V1:

public class A {
	public A(int... i) {}
}*/
	/*V2:

public class A {
	public A(int i) {}
}*/
	}
}
