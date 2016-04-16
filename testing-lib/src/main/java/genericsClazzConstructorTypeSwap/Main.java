package genericsClazzConstructorTypeSwap;

import testing_lib.genericsClazzConstructorTypeSwap.GenericsClazzConstructorTypeSwap;

public class Main {

	public static void main(String[] args) {
		GenericsClazzConstructorTypeSwap constr =  new GenericsClazzConstructorTypeSwap(new Integer(5), "test");
		constr.toString();
	}
	
}
