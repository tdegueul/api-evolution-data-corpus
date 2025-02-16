package fieldtypechangedtestIncompatibleArray;

import testing_lib.fieldtypechangedtestIncompatibleArray.*;

public class Main {
	public static void main(String[] args) {
		int[] i = new A().f;
	/*V1:

public class A {
	public int[] f;
}*/
	/*V2:

public class A {
	public String[] f;
}*/
	}
}
