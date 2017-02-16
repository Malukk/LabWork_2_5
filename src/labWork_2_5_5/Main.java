package labWork_2_5_5;

import java.util.Arrays;

/**
 * Created by Bulik on 19.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        InitTest[] arr = new InitTest[5];
        for (int i = 0; i<arr.length; i++){
            arr[i]= new InitTest();
        }
        for (InitTest elem : arr){
            System.out.println(elem.getId());
        }
    }
}
