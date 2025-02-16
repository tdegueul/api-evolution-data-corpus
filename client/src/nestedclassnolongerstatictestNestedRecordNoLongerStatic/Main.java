package nestedclassnolongerstatictestNestedRecordNoLongerStatic;

import testing_lib.nestedclassnolongerstatictestNestedRecordNoLongerStatic.*;

public class Main {
	public static void main(String[] args) {
		new A.B();
	/*V1:
public class A { public static record B() {} }*/
	/*V2:
public class A { public record B() {} }*/
	}
}
