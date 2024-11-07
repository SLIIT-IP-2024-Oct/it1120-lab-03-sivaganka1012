import java.util.Scanner;

public class IT24103953Lab3Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rupee amount: ");
        int amount = input.nextInt();

        int num5000 = amount / 5000;
        amount %= 5000;

        int num1000 = amount / 1000;
        amount %= 1000;

        int num500 = amount / 500;
        amount %= 500;

        int num200 = amount / 200;
        amount %= 200;

        int num100 = amount / 100;
        amount %= 100;

        int num50 = amount / 50;
        amount %= 50;

        int num20 = amount / 20;
        amount %= 20;

        int num10 = amount / 10;
        amount %= 10;

        int num5 = amount / 5;
        amount %= 5;

        int num2 = amount / 2;
        amount %= 2;

        int num1 = amount;

        System.out.println("5000 Notes  " + num5000);
        System.out.println("1000 Notes  " + num1000);
        System.out.println("500 Notes  " + num500);
        System.out.println("200 Notes  " + num200);
        System.out.println("100 Notes  " + num100);
        System.out.println("50 Notes  " + num50);
        System.out.println("20 Notes  " + num20);
        System.out.println("10 Notes  " + num10);
        System.out.println("05 Notes  " + num5);
        System.out.println("02 Notes  " + num2);
        System.out.println("01 Notes  " + num1);

        input.close();
    }
}
