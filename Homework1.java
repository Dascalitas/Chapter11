package homeworkChapter11;

class ExceptionA1 extends Exception { 
	public ExceptionA1(String errorMessage) {
		super(errorMessage + "in class A ");
		
		}
}

class ExceptionB1 extends ExceptionA {

	public ExceptionB1(String errorMessage){
		super(errorMessage + "in class B ");
		
	}
}
	     
class ExceptionC extends ExceptionB {
	
	public ExceptionC(String errorMessage){
		super(errorMessage + " in class C ");
		
	}
}

public class Homework1 {

	public static void main(String[] args) {
		ExceptionC example= new ExceptionC("3десь могла бы быть ваша реклама");
		System.err.println(example);
	}

}


//11.16 (Catching Exceptions with Superclasses) Use inheritance to create an exception superclass
//(called ExceptionA) and exception subclasses ExceptionB and ExceptionC, where ExceptionB inherits 
//from ExceptionA and ExceptionC inherits from ExceptionB. Write a program to demonstrate that the 
//catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.