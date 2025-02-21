package inheritanceIfazeMethodMovedToSuperInterface;

import testing_lib.inheritanceIfazeMethodMovedToSuperInterface.InheritanceIfazeMethodMovedToSuperInterface;

import java.util.function.Consumer;

public class Main implements InheritanceIfazeMethodMovedToSuperInterface {

	@Override
	public void method1() {
		
	}

	public static void main(String[] args) {
		InheritanceIfazeMethodMovedToSuperInterface ifaze = new Main();
		ifaze.method1();
		Consumer<InheritanceIfazeMethodMovedToSuperInterface> f1 = InheritanceIfazeMethodMovedToSuperInterface::method1;
		InheritanceIfazeMethodMovedToSuperInterface ifaze1 = new InheritanceIfazeMethodMovedToSuperInterface() {
			@Override
			public void method1() {

			}
		};
		ifaze1.method1();
	}
	
}
