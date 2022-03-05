package week3.day1;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	
public static void main(String[] args) {
	Calculator cal = new Calculator();
	
	cal.add(2, 5);
	cal.add(0.2F, 0.5F);
	cal.add(2, 5, 7);
	
	
	
	
	
	
}
}
