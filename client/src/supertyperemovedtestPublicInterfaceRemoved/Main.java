package supertyperemovedtestPublicInterfaceRemoved;

import testing_lib.supertyperemovedtestPublicInterfaceRemoved.*;

public class Main {
	public static void main(String[] args) {
		A a = new B();
	/*V1:

public interface A {}
public class B implements A {}*/
	/*V2:

public interface A {}
public class B {}*/
	}
}
