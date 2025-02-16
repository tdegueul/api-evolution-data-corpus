package fieldnolongerstatictestFieldNoLongerStatic;

import testing_lib.fieldnolongerstatictestFieldNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		int i = A.f;
	/*V1:

public class A {
	public static int f;
}*/
	/*V2:

public class A {
	public int f = 0;
}*/
	}
}
