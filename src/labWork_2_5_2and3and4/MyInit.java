package labWork_2_5_2and3and4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Bulik on 19.07.2016.
 */
public class MyInit {
    private static int[] arr;
  static   {
        arr = new int[10];
        Random random = new Random();
        for (int i = 0; i< arr.length; i++){
           arr[i] = 10 + random.nextInt(90);
        }
    }
    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }

    public MyInit() {
        System.out.println("Constructor 1");
    }

    public MyInit(int arr) {
        System.out.println("Constructor 2");
    }
}
