import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }


        int min = s.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                sum+=arr[i];
            }
        }

        System.out.println(sum);
    }
}