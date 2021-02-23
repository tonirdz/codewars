import java.util.Arrays;

public class Max_Min_Arrays {
    public static int[] solve (int[] arr){
        int[] result = new int[arr.length];
        int i = 0, j = arr.length - 1, k = 0;
        Arrays.sort(arr);
        while(i <= j) {
            result[k++] = arr[j--];
            if (j > i) result[k++] = arr[i++];
        }
        return result;
    }
}
