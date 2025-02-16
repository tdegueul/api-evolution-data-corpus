package methodnowabstracttestAbstractClassImplementsInterfaceMethodAsAbstract;

import testing_lib.methodnowabstracttestAbstractClassImplementsInterfaceMethodAsAbstract.*;

public class Main extends A {
	public static void main(String[] args) {
		new Main();
	/*V1:

public interface I {
  void m();
}
public abstract class A implements I {
  public void m() {}
}*/
	/*V2:

public interface I {
  void m();
}
public abstract class A implements I {
  public abstract void m();
}*/
	}
}
