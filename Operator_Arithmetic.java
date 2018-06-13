public class Operator_Arithmetic {
	
	int a;
	int b;
	int c;
	
	Operator_Arithmetic() {
		
		a = 10;
		b = 2;
	}
	
	void add() {
		
		c = a + b;
		System.out.println("The Addition is : " + c);
	}
	
	void sub() {
		
		c = a - b;
		System.out.println("The Subtraction is : " + c);
	}
	
	void multi() {
		
		c = a * b;
		System.out.println("The Multiplication is : " + c);
	}
	
	void div() {
		
		c = a / b;
		System.out.println("The Division is : " + c);
	}
	
	void mod() {
		
		c = a % b;
		System.out.println("The Modulus is : " + c);
	}
	
	void inc() {
		
		c = ++a;
		System.out.println("The Increment is : " + c);
	}
	
	void dec() {
		
		c = --a;
		System.out.println("The Decrement is : " + c);
	}
}
 
class MainClass {
	
	public static void main (String args[]) {
		
		Operator_Arithmetic obj = new Operator_Arithmetic();
		
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
		obj.mod();
		obj.inc();
		obj.dec();
	}
}