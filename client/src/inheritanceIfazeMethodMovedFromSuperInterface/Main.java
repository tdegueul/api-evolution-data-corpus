package inheritanceIfazeMethodMovedFromSuperInterface;

import testing_lib.inheritanceIfazeMethodMovedFromSuperInterface.InheritanceIfazeMethodMovedFromSuperInterface;
import testing_lib.inheritanceIfazeMethodMovedFromSuperInterface.Interface1;

public class Main implements Interface1 {

	@Override
	public void method1() {
		
	}

	public static void main(String[] args) {
		Interface1 ifaze = new Main();
		ifaze.method1();
	}
	
}
