package homeworkChapter11;

public class Homework3 {

	static void someMethod2 () throws Exception {
		throw new Exception("Exception throw in secont method");
	}
	
	static void someMethod () throws Exception {
		someMethod2();
	}
	
	public static void main(String[] args) {
		try {
			someMethod();
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}

//11.20 (Rethrowing Exceptions) Write a program that illustrates rethrowing an exception. Define
//methods someMethod and someMethod2. Method someMethod2 should initially throw an exception.
//Method someMethod should call someMethod2, catch the exception and rethrow it. Call someMethod
//from method main, and catch the rethrown exception. Print the stack trace of this exception.