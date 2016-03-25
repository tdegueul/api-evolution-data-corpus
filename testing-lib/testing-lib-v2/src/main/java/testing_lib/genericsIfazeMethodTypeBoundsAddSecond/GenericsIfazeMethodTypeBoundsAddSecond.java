package testing_lib.genericsIfazeMethodTypeBoundsAddSecond;

import java.io.Serializable;

public interface GenericsIfazeMethodTypeBoundsAddSecond {
	
	public <T extends Number & Serializable> void method1();
	
}
