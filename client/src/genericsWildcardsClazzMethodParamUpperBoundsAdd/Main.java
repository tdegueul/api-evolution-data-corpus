package genericsWildcardsClazzMethodParamUpperBoundsAdd;

import java.util.ArrayList;

import testing_lib.genericsWildcardsClazzMethodParamUpperBoundsAdd.GenericsWildcardsClazzMethodParamUpperBoundsAdd;

public class Main {

	public static void main(String[] args) {
		GenericsWildcardsClazzMethodParamUpperBoundsAdd constr = new GenericsWildcardsClazzMethodParamUpperBoundsAdd();
		ArrayList<String> param1 = new ArrayList<String>();
		constr.method1(param1);
	}
	
}
