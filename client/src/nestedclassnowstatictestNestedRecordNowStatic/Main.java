package nestedclassnowstatictestNestedRecordNowStatic;

import testing_lib.nestedclassnowstatictestNestedRecordNowStatic.*;

public class Main {
	public static void main(String[] args) {
		new A.B();
	/*V1:
public class A { public record B() {} }*/
	/*V2:
public class A { public static record B() {} }*/
	}
}
