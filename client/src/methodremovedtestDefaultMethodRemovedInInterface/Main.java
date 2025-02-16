package methodremovedtestDefaultMethodRemovedInInterface;

import testing_lib.methodremovedtestDefaultMethodRemovedInInterface.*;

public class Main implements I {
	@Override public void m1() {
	}

	public static void main(String[] args) {
		new Main();
	/*V1:

public interface I {
    default void m1() {}
}*/
	/*V2:
public interface I {}*/
	}
}
