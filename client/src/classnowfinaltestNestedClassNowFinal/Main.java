package classnowfinaltestNestedClassNowFinal;

import testing_lib.classnowfinaltestNestedClassNowFinal.*;

public class Main extends A.B {
	public static void main(String[] args) {
		new Main();
	/*V1:

public class A {
	static public class B {}
}*/
	/*V2:

public class A {
	static public final class B {}
}*/
	}
}
