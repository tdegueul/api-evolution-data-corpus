package fieldremovedtestLeakedPublicFieldNowPrivate;

import testing_lib.fieldremovedtestLeakedPublicFieldNowPrivate.*;

public class Main extends B {
	public void m() {
		f1 = 2;
	}
	public static void main(String[] args) {
		new Main();
	/*V1:

class A {
	public int f1;
}
public class B extends A {
	public int f2;
}*/
	/*V2:

class A {
	int f1;
}
public class B extends A {
	public int f2;
}*/
	}
}
