package work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число => ");
        int x = sc.nextInt();
        sc.close();
        /*switch (x){
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
            default:
                 System.out.println("Другое");
                 break;
        }*/

        if (x == 1)
            System.out.println("Один");
        else if (x == 2)
            System.out.println("Два");
        else if (x == 3)
            System.out.println("Три");
        else if (x == 4)
            System.out.println("Четыре");
        else if (x == 5)
            System.out.println("Пять");
        else if (x == 6)
            System.out.println("Шесть");
        else if (x == 7)
            System.out.println("Семь");
        else if (x == 8)
            System.out.println("Восемь");
        else if (x == 9)
            System.out.println("Девять");
        else
            System.out.println("Другое");
    }
}
