package methodabstractaddedtoclasstestMethodAbstractAddedToClassIndirect;

import testing_lib.methodabstractaddedtoclasstestMethodAbstractAddedToClassIndirect.*;

public class Main extends B {
	public static void main(String[] args) {
		new Main();
	/*V1:

public abstract class A {}
public abstract class B extends A {}*/
	/*V2:

public abstract class A {
	public abstract void m();
}
public abstract class B extends A {}*/
	}
}
