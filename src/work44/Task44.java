package work44;

public class Task44 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i <= 300){
            if ((i % 3 == 0) && (i % 4 == 0)){
                System.out.println(i);
                count+=1;
            }
            if (count == 10){
                break;
            }
            i++;
        }
    }
}
