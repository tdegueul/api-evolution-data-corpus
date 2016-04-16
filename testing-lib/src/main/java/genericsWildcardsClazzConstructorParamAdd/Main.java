package genericsWildcardsClazzConstructorParamAdd;

import java.util.ArrayList;

import testing_lib.genericsWildcardsClazzConstructorParamAdd.GenericsWildcardsClazzConstructorParamAdd;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> param1 = new ArrayList<String>(); 
		GenericsWildcardsClazzConstructorParamAdd constr =  new GenericsWildcardsClazzConstructorParamAdd(param1);
		constr.toString();
	}
	
}
