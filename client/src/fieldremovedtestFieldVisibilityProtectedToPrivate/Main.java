package fieldremovedtestFieldVisibilityProtectedToPrivate;

import testing_lib.fieldremovedtestFieldVisibilityProtectedToPrivate.*;

public class Main extends A {
	public void m() {
		f = 2;
	}

	public static void main(String[] args) {
		new Main();
	/*V1:

public class A {
    protected int f;
}*/
	/*V2:

public class A {
    private int f;
}*/
	}
}
