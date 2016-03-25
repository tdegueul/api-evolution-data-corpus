package accessModifierClazzNestedClazzAccessDecrease;

import testing_lib.accessModifierClazzNestedClazzAccessDecrease.AccessModifierClazzNestedClazzAccessDecrease;

public class Main {

	public static void main(String[] args) {
		AccessModifierClazzNestedClazzAccessDecrease constr = new AccessModifierClazzNestedClazzAccessDecrease();
		
		AccessModifierClazzNestedClazzAccessDecrease.ClazzPublicToProtected constrNCPublicToProtected = constr.new ClazzPublicToProtected();  
		AccessModifierClazzNestedClazzAccessDecrease.ClazzPublicToNon constrNCPublicToNon = constr.new ClazzPublicToNon();
		AccessModifierClazzNestedClazzAccessDecrease.ClazzPublicToPrivate constrNCPublicToPrivate = constr.new ClazzPublicToPrivate();
		
	}
	
}
