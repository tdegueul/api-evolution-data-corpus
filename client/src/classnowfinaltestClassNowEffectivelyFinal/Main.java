package classnowfinaltestClassNowEffectivelyFinal;

import testing_lib.classnowfinaltestClassNowEffectivelyFinal.*;

public class Main extends A {
	public static void main(String[] args) {
		new Main();
	/*V1:
public class A {}*/
	/*V2:

public class A {
	private A() {}
}*/
	}
}
