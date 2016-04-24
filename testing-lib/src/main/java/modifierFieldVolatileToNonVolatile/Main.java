package modifierFieldVolatileToNonVolatile;

import testing_lib.modifierFieldTransientToNonTransient.ModifierFieldTransientToNonTransient;


public class Main {

	public static void main(String[] args) {
		ModifierFieldTransientToNonTransient constr = new ModifierFieldTransientToNonTransient();
		Integer test = constr.field;
	}
	
}
