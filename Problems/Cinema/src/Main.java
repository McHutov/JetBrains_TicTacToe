import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int row = s.nextInt();
        int column = s.nextInt();
        int[][] arr = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = s.nextInt();
            }
        }

        int seats = s.nextInt();

        int index = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(arr[i][j] == 0){
                    index++;
                    if(index == seats){
                        System.out.println(i+1);
                        System.exit(0);
                    }
                }else
                {
                    index = 0;
                }
            }
            index = 0;
        }

        System.out.println(0);

    }
}