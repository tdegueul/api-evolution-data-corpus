package dataTypeClazzMethodParamMutation.arrayToVarArity;

import testing_lib.dataTypeClazzMethodParamMutation.arrayToVarArity.DataTypeClazzMethodParamArrayToVarArity;

public class Main {

	public static void main(String[] args) {

		DataTypeClazzMethodParamArrayToVarArity constr = new DataTypeClazzMethodParamArrayToVarArity();
		Integer field = 5;
		
		Integer[] param1 = new Integer[5];
		constr.method1(field, param1);
		
	}

}
