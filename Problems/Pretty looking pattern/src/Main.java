import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] lines = new String[4];
        String[][] square = new String[4][4];
        int flag = 0;

        for(int i = 0; i < 4; i++){
                lines[i] = s.next();
        }

        for(int i = 0; i < 4; i++){
            for(int j =0; j < 4; j++){
                square[i][j] = String.valueOf(lines[i].charAt(j));
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    if(square[i][j].equals(square[i][j+1])) {
                        if(square[i][j].equals(square[i+1][j])){
                            if(square[i+1][j].equals(square[i+1][j+1])){
                                    System.out.println("NO");
                                    System.exit(00);
                            }
                        }
                    }
            }
        }

        System.out.println("YES");
    }

}