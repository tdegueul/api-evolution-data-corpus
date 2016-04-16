package genericsWildcardsClazzConstructorParamDelete;

import java.util.ArrayList;

import testing_lib.genericsWildcardsClazzConstructorParamDelete.GenericsWildcardsClazzConstructorParamDelete;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> param1 = new ArrayList<Integer>(); 
		GenericsWildcardsClazzConstructorParamDelete constr =  new GenericsWildcardsClazzConstructorParamDelete(param1);
		constr.toString();
	}
	
}
