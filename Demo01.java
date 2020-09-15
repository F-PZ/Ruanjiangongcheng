import java.util.Arrays;

public class Demo01 {
 public static void mp(int arr[]){
  for (int i = 0; i <= arr.length - 1; i++){
   for (int j = 0; j < arr.length - 1 - i;j++){
    if (arr[j] > arr[j+1]){
     int temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;
    }
   }
  }
 }
}

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Demo01Test {

 @Test
 public void test() {
  int[] arr={12,6,4,8,3};
  Demo01.mpPx(arr);
  System.out.println(Arrays.toString(arr));
 }
}
