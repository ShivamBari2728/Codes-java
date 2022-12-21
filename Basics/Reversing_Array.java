import java.util.Arrays;

public class Reversing_Array {
    public static void main(String[] args) {
        int[] arr = {1,34,78,90};
        int j = (arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            while(i<j)
            {
                int temp=0;
                temp=arr[i];
                arr[j]=arr[i];
                temp = arr[j];
                j--;
            }
        }
        System.out.print(Arrays.toString(arr));

    }
}
