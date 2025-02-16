package methodremovedtestInterfaceMethodRemovedAffectingImplementer;

import testing_lib.methodremovedtestInterfaceMethodRemovedAffectingImplementer.*;

public class Main extends A {
	@Override public void m1() {
		super.m1();
	}

	public static void main(String[] args) {
		new Main();
	/*V1:

public interface I {
    void m1();
}
public class A implements I {
    public void m1() {}
}*/
	/*V2:

public interface I {}
public class A implements I {}*/
	}
}
