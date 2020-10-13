import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String[][] star = new String[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                star[i][j] = ".";
            }
        }
        int d1 = 0;
        int d2 = 0;
        int identificator = 0;
        for(int i = 0; i < size; i++){
            if(identificator == 0) {
                for (int j = 0; j < size; j++) {
                    star[d1++][d2++] = "*";
                }
                identificator = 1;
                d1 = 0;
                d2 -=1;
            }
            star[i][size/2] = "*";
            star[size/2][i] = "*";
            star[d1++][d2--] = "*";
        }

       for(int i = 0; i < size; i++){
           for(int j = 0; j < size; j++){
               System.out.print(star[i][j]+ " ");
           }
           System.out.println();
       }
    }
}