package fieldremovedtestLeakedPublicFieldNoLongerLeaked;

import testing_lib.fieldremovedtestLeakedPublicFieldNoLongerLeaked.*;

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
	public int f1;
}
public class B {
	public int f2;
}*/
	}
}
