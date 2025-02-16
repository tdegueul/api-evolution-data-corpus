package nestedclassnolongerstatictestNestedEnumNoLongerStatic;

import testing_lib.nestedclassnolongerstatictestNestedEnumNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		A.B.valueOf("");
	/*V1:
public class A { public static enum B {} }*/
	/*V2:
public class A { public enum B {} }*/
	}
}
