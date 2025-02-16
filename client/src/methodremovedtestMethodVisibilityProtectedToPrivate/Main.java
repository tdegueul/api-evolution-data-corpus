package methodremovedtestMethodVisibilityProtectedToPrivate;

import testing_lib.methodremovedtestMethodVisibilityProtectedToPrivate.*;

public class Main extends A {
	void m() {
		m1();
	}

	public static void main(String[] args) {
	/*V1:

public class A {
    protected void m1() {}
}*/
	/*V2:

public class A {
    private void m1() {}
}*/
	}
}
