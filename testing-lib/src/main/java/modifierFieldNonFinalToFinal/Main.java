package modifierFieldNonFinalToFinal;

import testing_lib.modifierFieldNonFinalToFinal.ModifierFieldNonFinalToFinal;

public class Main {

	public static void main(String[] args) {
		ModifierFieldNonFinalToFinal constr = new ModifierFieldNonFinalToFinal();
		System.out.println(constr.FIELD);
		constr.FIELD = new Integer(10);
		
	}
	
}
