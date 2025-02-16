package methodremovedtestMethodVisibilityReducedFromPublicToPackagePrivate;

import testing_lib.methodremovedtestMethodVisibilityReducedFromPublicToPackagePrivate.*;

public class Main {
	public static void main(String[] args) {
		new A().m1();
	/*V1:

public class A {
    public void m1() {}
}*/
	/*V2:

public class A {
    void m1() {}
}*/
	}
}
