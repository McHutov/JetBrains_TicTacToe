import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       Integer[] box1 = new Integer[3];
       Integer[] box2 = new Integer[3];

        for (int i = 0; i < 3; i++){
            box1[i] = s.nextInt();
        }
        Arrays.sort(box1, Collections.reverseOrder());
        for (int i = 0; i < 3; i++){
            box2[i] = s.nextInt();
        }
        Arrays.sort(box2, Collections.reverseOrder());

        int result = 0;

        if((box1[0]+box1[1]+box1[2]) > (box2[0]+box2[1]+box2[2])){
            for(int i = 0; i < 3; i++){
                if(box1[i] > box2[i]){
                    result++;
                }else{
                    result--;
                }
            }
        }else{
            if((box1[0]+box1[1]+box1[2]) < (box2[0]+box2[1]+box2[2])){
                for(int i = 0; i < 3; i++){
                    if(box1[i] < box2[i]){
                        result--;
                    }else{
                        result++;
                    }
                }
            }
        }

        if(result == 3){
            System.out.println("Box 1 > Box 2");
        } else {
            if (result == -3) {
                System.out.println("Box 1 < Box 2");
            }else{
                System.out.println("Incompatible");
            }
        }

    }
}