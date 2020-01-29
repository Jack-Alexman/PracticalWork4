package work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую целочисленную переменную => ");
        int a = sc.nextInt();
        System.out.print("Введите вторую целочисленную переменную => ");
        int b = sc.nextInt();
        System.out.print("Введите третью целочисленную переменную => ");
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c){
            System.out.println("Наибольшее значение из трех: " + a);
        }
        if (b > c && b > a){
            System.out.println("Наибольшее значение из трех: " + b);
        } else {
            System.out.println("Наибольшее значение из трех: " + c);
        }
    }
}
