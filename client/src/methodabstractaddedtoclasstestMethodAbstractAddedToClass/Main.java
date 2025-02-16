package methodabstractaddedtoclasstestMethodAbstractAddedToClass;

import testing_lib.methodabstractaddedtoclasstestMethodAbstractAddedToClass.*;

public class Main extends A {
	public static void main(String[] args) {
		new Main();
	/*V1:
public abstract class A {}*/
	/*V2:

public abstract class A {
	public abstract void m();
}*/
	}
}
