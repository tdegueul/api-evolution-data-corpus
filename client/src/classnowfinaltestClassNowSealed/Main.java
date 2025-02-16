package classnowfinaltestClassNowSealed;

import testing_lib.classnowfinaltestClassNowSealed.*;

public class Main extends A {
	public static void main(String[] args) {
		new Main();
	/*V1:
public class A {}*/
	/*V2:

public sealed class A permits B {}
final class B extends A {}*/
	}
}
