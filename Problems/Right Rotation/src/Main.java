import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] arr = s.nextLine().split(" ");
        int shift = s.nextInt();

        String[] result = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[(i+shift)%arr.length] = arr[i];
        }

        System.out.println(String.join(" ", result));
    }
}