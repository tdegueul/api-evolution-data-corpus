package fieldremovedtestFieldVisibilityPkgPrivateToPrivate;

import testing_lib.fieldremovedtestFieldVisibilityPkgPrivateToPrivate.*;

public class Main {
	public static void main(String[] args) {
		// cannot access f
	/*V1:

public class A {
    int f;
}*/
	/*V2:

public class A {
    private int f;
}*/
	}
}
