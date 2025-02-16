package supertyperemovedtestPublicInterfaceRemovedIndirect;

import testing_lib.supertyperemovedtestPublicInterfaceRemovedIndirect.*;

public class Main {
	public static void main(String[] args) {
		A a = new C();
	/*V1:

public interface A {}
class B implements A {}
public class C extends B {}*/
	/*V2:

public interface A {}
class B {}
public class C extends B {}*/
	}
}
