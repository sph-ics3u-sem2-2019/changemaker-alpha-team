import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		double change=payment-cost;
		int num100;
		int num50;
		int num20;
		int num10;
		int num5;
		int num2;
		int num1;
		int numQ;
		int numD;
		int numN;
		//TODO: Here is where your code goes
		if (payment>cost) {
		
		System.out.println("your change is "+change);
		
		
		num100=(int)(change/100);
		if (num100>0) {
			System.out.println(num100+" hundred dollar bills");
		} change=change%100;
		
		num50=(int)(change/50);
		if (num50>0) {
			System.out.println(num50+" fifty dollar bills");
		} change=change%50;
		
		num20=(int)(change/20);
		if (num20>0) {
			System.out.println(num20+" twenty dollar bills");
		} change=change%20;
		
		num10=(int)(change/10);
		if (num10>0) {
			System.out.println(num10+" ten dollar bills");
		} change=change%10;
		
		num5=(int)(change/5);
		if (num5>0) {
			System.out.println(num5+" five dollar bills");
		} change=change%5;
		
		num2=(int)(change/2);
		if (num2>0) {
			System.out.println(num2+" toonies");
		} change=change%2;
		
		num1=(int)(change/1);
		if (num1>0) {
			System.out.println(num1+" loonies");
		} change=change%1;
		
		numQ=(int)(change/0.25);
		if (numQ>0) {
			System.out.println(numQ+" quarters");
		} change=change%0.25;
		
		numD=(int)(change/0.1);
		if (numD>0) {
			System.out.println(numD+" dimes");
		} change=change%0.1;
		
		numN=(int)(change/0.05);
		if (numN>0) {
			if(change >= 0.025);{
				numN=numN+1;}
			System.out.println(numN+" nickels");
		} change=change%0.05;
		
	
		
	}
		if (payment<cost) {
			double need;
			need=cost-payment;
			System.out.println("NOT ENOUGH CHANGE\n YOU NEED $"+need+" TO AFFORD THIS");
			System.out.format("NOT ENOUGH CHANGE%nYOU NEED $%.2f TO AFFORD THIS" , need);
			
			
			//do cost-payment to see how much more money you need
		}
}
	
}
//