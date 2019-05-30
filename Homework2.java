package homeworkChapter11;

import java.io.IOException;

class ExceptionA extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionA(String errorMessage) {
		super(errorMessage + "in class A ");

	}
}

class ExceptionB extends ExceptionA {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionB(String errorMessage) {
		super(errorMessage + "in class B ");

	}
}

public class Homework2 {

	public static void main(String[] args) {
		try {
			System.out.println("try to throw exception A");
			throw new ExceptionA("exception A");
		} catch (Exception e) {
			System.out.println("Exception A\n");
		}

		try {
			System.out.println("try to throw exception B");
			throw new ExceptionB("exception B");
		} catch (Exception e) {
			System.out.println("Exception B\n");
		}

		try {
			System.out.println("try to throw Null pointer exception");
			throw new NullPointerException("Null pointer exception");
		} catch (Exception e) {
			System.out.println("Null pointer Exception\n");
		}

		try {
			System.out.println("try to throw Input/Output Exception");
			throw new IOException("Input/Output Exception");
		} catch (Exception e) {
			System.out.println("Input/Output Exception\n");
		}
	}

}


//11.17	(Catching Exceptions Using Class Exception) Write a program that demonstrates how various exceptions are caught with
//catch (Exception exception)
//This time, define classes ExceptionA (which inherits from class Exception) and ExceptionB (which
//inherits from class ExceptionA). In your program, create try blocks that throw exceptions of types
//ExceptionA, ExceptionB, NullPointerException and IOException. All exceptions should be
//caught with catch blocks specifying type Exception.