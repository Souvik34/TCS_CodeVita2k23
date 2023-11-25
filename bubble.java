import java.util.*;
public class bubble {

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 3};  
        int swapCount = 0;
        int mismatchCount = 0;

        for (int i = 0; i < 5 - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swapCount++;
                mismatchCount = 1;
            } else if (arr[i] == arr[i + 1]) {
                if (mismatchCount == 1) {
                    swapCount++;
                }
            } else {
                mismatchCount++;
            }
        }

        if (swapCount == 0) {
            System.out.println(swapCount);;
        }

        if (swapCount % 2 == 0) {
            System.out.println(swapCount);;
        }
        else
        {
            System.out.println("Not");
        }
      
    }
}
