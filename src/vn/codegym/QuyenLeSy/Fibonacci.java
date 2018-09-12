package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        System.out.print("Input index in Fibonacci: ");
        index = scanner.nextInt();

        int result = findFibonacci(index);
        System.out.println("The value at position " + index + " in the fibonacci range is: " + result);
    }

    public static int findFibonacci(int index){
        if(index < 3){
            return 1;
        }

        return findFibonacci(index - 2) + findFibonacci(index - 1);
    }
}
