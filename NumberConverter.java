package Assignment1;

import java.util.Scanner;
/**
 * Assignment 01 Task 03 Number Converter
 *
 * @author Astghik Minasyan
 */
public class NumberConverter {
    public static void main(String[] args) {
        System.out.print("Please enter a 4-digits Octal number: ");
        Scanner num = new Scanner(System.in);
        int octal = num.nextInt();

        int oct1 = octal % 10;
        int oct2 = (octal % 100 - oct1) / 10;
        int oct3 = (octal % 1000 - octal % 100) / 100;
        int oct4 = (octal % 10000 - octal % 1000) / 1000;

        int deci1 = oct1 * (int) Math.pow(8, 0);
        int deci2 = oct2 * (int) Math.pow(8, 1);
        int deci3 = oct3 * (int) Math.pow(8, 2);
        int deci4 = oct4 * (int) Math.pow(8, 3);
        int decimal = deci1 + deci2 + deci3 + deci4;

        System.out.printf("\n\n%-15s: %s", "Octal Number", octal);
        System.out.printf("\n%-15s: %d", "Decimal Number", decimal);
    }
}
