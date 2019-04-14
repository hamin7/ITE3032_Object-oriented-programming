// ShowInnerClass.java: Demonstrate using inner classes
public class ShowInnerClass {
	private int data;
	InnerClass instance = new InnerClass(); // inner Object

	/** A method in the outer class */
	public void m() {
		// Do something
		
	}
	
	public static void main(String[] args) {
		ShowInnerClass obj = new ShowInnerClass();
		// InnerClass obj1 = new InnerClass(); Statement triggers ERROR
		obj.instance.mi();
	}
	
	// An inner class
	class InnerClass {
		/** A method in the inner class */
		public void mi() {
			// Directly reference data and method defined in its outer class
			data++;
			m();
		}
	}
}

