package methodnolongervarargstestMethodNoLongerVarargsFirst;

import testing_lib.methodnolongervarargstestMethodNoLongerVarargsFirst.*;

public class Main {
	public static void main(String[] args) {
		new A().m(0, 1);
	/*V1:

public class A {
	public void m(int... i) {}
}*/
	/*V2:

public class A {
	public void m(int i) {}
}*/
	}
}
