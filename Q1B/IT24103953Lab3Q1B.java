import java.util.Scanner;
public class IT24103953Lab3Q1B {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the price of 1kg of rice:");
	double Price_Per_KG = input.nextDouble();
	System.out.print("Enter the number of kilograms you want to buy:");
	double Number_Of_KG = input.nextDouble();
	double TotalAmount= Price_Per_KG * Number_Of_KG;
	double Discount = TotalAmount*0.10;
	double FinalAmount = TotalAmount-Discount;
	System.out.println("The total amount with 10% discount is:" + FinalAmount);
}
}