package week1.day1;

public class HelloSelenium {

	int x=56004; //Global variable
	String[] fruits = {"mango","banana","guava"}; //string array
	int[] numbers = {1,2,3,4,5}; //array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("%%% Welcome to Selenium Training Program, Sethu");

		HelloSelenium h=new HelloSelenium();
		h.sum();
		System.out.println(h.x);
		sub();
		
	}

	public void sum() {

		System.out.println("Sum");
	sub();
	}
	public static void sub() {
		System.out.println("Sub");

				
	}
}
