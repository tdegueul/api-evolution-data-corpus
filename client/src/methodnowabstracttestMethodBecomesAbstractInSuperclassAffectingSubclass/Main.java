package methodnowabstracttestMethodBecomesAbstractInSuperclassAffectingSubclass;

import testing_lib.methodnowabstracttestMethodBecomesAbstractInSuperclassAffectingSubclass.*;

public class Main extends A {
	public static void main(String[] args) {
	/*V1:

public abstract class A {
  public void m() {}
}
public class B extends A {}*/
	/*V2:

public abstract class A {
  public abstract void m();
}
public class B extends A {}*/
	}
}
