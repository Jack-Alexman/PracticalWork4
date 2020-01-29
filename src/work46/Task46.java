package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целочисленную переменную => ");
        int a = sc.nextInt();
        sc.close();
        int result = 0;
        while (a % 10 > 0){
            result += (int)Math.pow(a % 10, 2);
            a /= 10;
        }
        System.out.println(result);
    }
}
