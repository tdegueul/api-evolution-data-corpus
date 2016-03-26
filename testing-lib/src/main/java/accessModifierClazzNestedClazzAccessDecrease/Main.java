package accessModifierClazzNestedClazzAccessDecrease;

import testing_lib.accessModifierClazzNestedClazzAccessDecrease.AccessModifierClazzNestedClazzAccessDecrease;

public class Main {

	public static void main(String[] args) {
		AccessModifierClazzNestedClazzAccessDecrease constr = new AccessModifierClazzNestedClazzAccessDecrease();
		
		constr.new ClazzPublicToProtected();  
		constr.new ClazzPublicToNon();
		constr.new ClazzPublicToPrivate();
		
	}
	
}
