
public class Parent 
{
		
	    //method 1 of parent class
		private void method1()
		{
		 System.out.println ("Parent's method1()");
		}
	    
		//method2 of parent class
		public void method2() 
		{
		 System.out.println ("Parent's method2()");
		 
		 //call method1 of parent class
		 method1();
		}
		
}


class Child extends Parent 
{
		
		//method1 of child class
		public void method1() 
		{
		 System.out.println ("Child's method1()");
		} 
		
		
		//main method
		public static void main(String args[]) 
		{
			
			//parent reference to a child class
			Parent p = new Child();
			
			
			p.method2();
			
			
		}
}


