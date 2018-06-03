package basic;

public class Day1 {
	int num1=10;
	int num2=5;
	int add, sub, div, rem, mul;
	
	public void doCalculation(){
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		rem=num1%num2;
		
		System.out.println("Addition=" + add);
		System.out.println("Subraction="+ sub);
		System.out.println("Product="+ mul);
		System.out.println("division="+div);
		System.out.println("remainder="+rem);
	}
	
	public static void main(String[] args) {
		Day1 d = new Day1();
		d.doCalculation();
	}
}
