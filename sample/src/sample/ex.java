package sample;
class Base {
	static void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}

}
class Derived extends Base {
		static void display() {
			System.out.println("Static or class method from Derived");
		}

		public void print() {
			System.out.println("Non-static or instance method from Derived");
		}
}
public class ex {
public static void main(String args[])
{
Base obj1= new Derived();
obj1.display();
obj1.print();

Derived obj2= new Derived();
obj2.display();
obj2.print();



Base obj4= new Base();
obj4.display();
obj4.print();

Derived obj3= (Derived) new Base();
obj3.display();
obj3.print();

}
}