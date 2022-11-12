import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of a  & b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("before swapping =  a +" + a + " b = " + b);
        a =b +a;
        b = a -b;
        a = a - b;
        System.out.println("after swap = " + a + " b = " + b);
    }
}