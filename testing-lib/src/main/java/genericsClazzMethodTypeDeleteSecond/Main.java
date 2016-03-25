package genericsClazzMethodTypeDeleteSecond;

import testing_lib.genericsClazzMethodTypeDeleteSecond.GenericsClazzMethodTypeDeleteSecond;

public class Main {

	public static void main(String[] args) {
		GenericsClazzMethodTypeDeleteSecond constr = new GenericsClazzMethodTypeDeleteSecond();
		constr.<String, Integer>method1();
	}
	
}
