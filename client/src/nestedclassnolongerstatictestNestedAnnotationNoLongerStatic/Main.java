package nestedclassnolongerstatictestNestedAnnotationNoLongerStatic;

import testing_lib.nestedclassnolongerstatictestNestedAnnotationNoLongerStatic.*;

public class Main {
	@A.B
	public static void main(String[] args) {
	/*V1:
public class A { public static @interface B {} }*/
	/*V2:
public class A { public @interface B {} }*/
	}
}
