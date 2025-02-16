package methodnowabstracttestImplicitlyAbstractToAbstract;

import testing_lib.methodnowabstracttestImplicitlyAbstractToAbstract.*;

public class Main implements I {
	@Override public void m() {

	}

	public static void main(String[] args) {
	/*V1:

public interface I {
	void m();
}*/
	/*V2:

public interface I {
	abstract void m();
}*/
	}
}
