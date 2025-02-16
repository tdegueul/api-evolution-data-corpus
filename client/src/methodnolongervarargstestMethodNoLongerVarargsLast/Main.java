package methodnolongervarargstestMethodNoLongerVarargsLast;

import testing_lib.methodnolongervarargstestMethodNoLongerVarargsLast.*;

public class Main {
	public static void main(String[] args) {
		new A().m("", 0, 1);
	/*V1:

public class A {
	public void m(String s, int... i) {}
}*/
	/*V2:

public class A {
	public void m(String s, int i) {}
}*/
	}
}
