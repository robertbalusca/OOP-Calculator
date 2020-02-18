package Calculator;

import java.util.Scanner;

public class Calculator {

    private float num1;
    private float num2;
    private Scanner sc;
    public int option;
    public float result;

    public Calculator() {
        sc = new Scanner(System.in);
        System.out.println("Choose an operator ");
       
        System.out.println("1. Add ");
        System.out.println("2. Subtract ");
        System.out.println("3. Multiply ");
        System.out.println("4. Divide ");
        System.out.println("5. Modulo ");
       
        System.out.println("OPTION:");
        option = sc.nextInt();
        System.out.println("Enter num1");
        num1 = sc.nextFloat();
        System.out.println("Enter num2");
        num2 = sc.nextFloat();
    }

    public int set_option() {
        option = sc.nextInt();
        return option;
    }

    public float getX() {
        return this.num1;
    }

    public float getY() {
        return this.num2;
    }
}
