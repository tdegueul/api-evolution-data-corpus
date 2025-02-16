package fieldtypechangedtestSubtypeShadowing;

import testing_lib.fieldtypechangedtestSubtypeShadowing.*;

public class Main {
	public static void main(String[] args) {
		// No change
		Object o = new C().f;
		String p = new X().f;
	/*V1:

public interface I {
	public int f = 0;
}
public class C {
	public Object f = null;
}
public class X extends C implements I {
	public String f = "";
}*/
	/*V2:

public interface I {
	public int f = 0;
}
public class C {
	public Object f = null;
}
public class X extends C implements I {
	public String f = "";
}*/
	}
}
