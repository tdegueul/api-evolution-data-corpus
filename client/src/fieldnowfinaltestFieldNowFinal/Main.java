package fieldnowfinaltestFieldNowFinal;

import testing_lib.fieldnowfinaltestFieldNowFinal.*;

public class Main extends A {
	public void m() {
		f = 2;
	}

	public static void main(String[] args) {
		A a = new A();
		a.f = 2;
	/*V1:

public class A {
	public int f;
}*/
	/*V2:

public class A {
	public final int f = 0;
}*/
	}
}
