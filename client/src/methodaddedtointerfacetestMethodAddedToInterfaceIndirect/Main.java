package methodaddedtointerfacetestMethodAddedToInterfaceIndirect;

import testing_lib.methodaddedtointerfacetestMethodAddedToInterfaceIndirect.*;

public class Main implements J {
	public static void main(String[] args) {
		new Main();
	/*V1:

public interface I {}
public interface J extends I {}*/
	/*V2:

public interface I { void m(); }
public interface J extends I {}*/
	}
}
