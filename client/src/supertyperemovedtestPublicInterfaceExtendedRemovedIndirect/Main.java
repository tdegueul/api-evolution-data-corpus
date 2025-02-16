package supertyperemovedtestPublicInterfaceExtendedRemovedIndirect;

import testing_lib.supertyperemovedtestPublicInterfaceExtendedRemovedIndirect.*;

public class Main {
	public static void main(String[] args) {
		C c = null;
		A a = (A) c;
	/*V1:

public interface A {}
interface B extends A {}
public interface C extends B {}*/
	/*V2:

public interface A {}
interface B {}
public interface C extends B {}*/
	}
}
