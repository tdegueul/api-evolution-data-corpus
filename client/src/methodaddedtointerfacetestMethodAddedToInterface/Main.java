package methodaddedtointerfacetestMethodAddedToInterface;

import testing_lib.methodaddedtointerfacetestMethodAddedToInterface.*;

public class Main implements I {
	public static void main(String[] args) {
		new Main();
	/*V1:
public interface I {}*/
	/*V2:

public interface I {
	void m();
}*/
	}
}
