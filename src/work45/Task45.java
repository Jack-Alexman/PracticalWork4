package work45;

public class Task45 {
    public static void main(String[] args) {
        System.out.println("* |   1   2   3   4   5   6   7   8   9" +
                "\n" + "---------------------------------------");
        int i = 1;
        while (i < 10){
            System.out.print(i+" |");
            int j = 1;
            while (j < 10){
                System.out.printf("%4d", i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}