import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        String[] arr2 = new String[size];
        for(int i = 0; i < size; i++){
            arr1[i] = scanner.nextInt();
        }
        for(int i = 0; i < size;i++){
            arr2[(i+1)%size] = Integer.toString(arr1[i]);
        }
        System.out.println(String.join(" ", arr2));
    }
}