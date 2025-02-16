package nestedclassnowstatictestNestedEnumNowStatic;

import testing_lib.nestedclassnowstatictestNestedEnumNowStatic.*;

public class Main {
	public static void main(String[] args) {
		A.B a = A.B.valueOf("");
	/*V1:
public class A { public enum B {} }*/
	/*V2:
public class A { public static enum B {} }*/
	}
}
