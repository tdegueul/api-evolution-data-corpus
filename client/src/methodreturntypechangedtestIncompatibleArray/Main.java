package methodreturntypechangedtestIncompatibleArray;

import testing_lib.methodreturntypechangedtestIncompatibleArray.*;

public class Main {
	public static void main(String[] args) {
		int[] i = new A().m();
	/*V1:

public class A {
	public int[] m() { return new int[] { 0 }; }
}*/
	/*V2:

public class A {
	public String[] m() { return new String[] { "" }; }
}*/
	}
}
