package fieldnowstatictestFieldNowStatic;

import testing_lib.fieldnowstatictestFieldNowStatic.*;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.f = 2;
	/*V1:

public class A {
	public int f;
}*/
	/*V2:

public class A {
	public static int f = 0;
}*/
	}
}
